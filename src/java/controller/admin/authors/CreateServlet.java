/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.admin.authors;

import Models.DAOs.AuthorDAO;
import Models.Entities.Author;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Base64;

/**
 *
 * @author VIET
 */
@WebServlet(urlPatterns = {"/admin/authors/create"})
@MultipartConfig
public class CreateServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String authorName = name((String) req.getParameter("author-name"));
        int birthYear = Integer.parseInt(req.getParameter("author-birthYear"));
        String image = image((Part) req.getPart("author-image"));
        String description = (String) req.getParameter("author-description");
        
        Author a = new Author(authorName, birthYear, image, description);
        
        AuthorDAO ad = new AuthorDAO();
        ad.insert(a);
        
        resp.sendRedirect("/TangKinhCac/admin/authors");
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("here get");
        
    }
    
    public String image(Part part) throws IOException {

        long length = part.getSize();
        byte[] buffer = new byte[(int) length];
        InputStream inputStream = part.getInputStream();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        byte[] image = bos.toByteArray();
        String encode = Base64.getEncoder().encodeToString(image);
        return encode;
    }
    
    public String name(String name) {
        String newName = "";
        if (!name.contains("'")) {
            return name;
        } else {
            String[] list = name.split("[']");
            for (int i = 0; i < list.length - 1; i++) {
                newName += list[i];
                newName += "''";
            }
            newName += list[list.length - 1];
            return newName;
        }
    }
    
}
