/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.admin.publishers;

import Models.DAOs.PublisherDAO;
import Models.Entities.Publisher;
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
@WebServlet(urlPatterns = {"/admin/publisherEdit/*"})
@MultipartConfig
public class EditServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String path = req.getPathInfo();
        int publisherID = Integer.parseInt(path.split("/")[1]);
        
        String publisherName = name((String) req.getParameter("publisher-name"));
        String address = name((String) req.getParameter("publisher-address"));
        String email = (String) req.getParameter("publisher-email");
        int establishYear = Integer.parseInt((String) req.getParameter("publisher-establishYear"));
        String description = (String) req.getParameter("publisher-description");
        String image = "";
        Part part = (Part) req.getPart("publisher-image");
        if (part.getSize() != 0) {
            image = image(part);
        } else {
            image = req.getParameter("image").split("data:image/jpeg;base64,")[1];
        }
        
        Publisher p = new Publisher(publisherID, publisherName, address, email, establishYear, description, image);
        
        PublisherDAO pd = new PublisherDAO();
        pd.update(p);
        
        resp.sendRedirect("/TangKinhCac/admin/publishers");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter out = resp.getWriter();
        String path = req.getPathInfo();
        int publisherID = Integer.parseInt(path.split("/")[1]);
        
        PublisherDAO pd = new PublisherDAO();
        Publisher p = pd.getOne(publisherID);
        
        req.setAttribute("p", p);
        req.getRequestDispatcher("/admin/publishers/edit.jsp").forward(req, resp);
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