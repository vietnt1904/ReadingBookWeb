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
@WebServlet(urlPatterns = {"/admin/publishers/create"})
@MultipartConfig
public class CreateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String publisherName = name((String) req.getParameter("publisher-name"));
        out.print((String) req.getParameter("publisher-name"));
        String address = name((String) req.getParameter("publisher-address"));
        String email = (String) req.getParameter("publisher-email");
        int establishYear = Integer.parseInt((String) req.getParameter("publisher-establishYear"));
        String description = (String) req.getParameter("publisher-description");
        String image = image((Part) req.getPart("publisher-image"));
        out.print(address + email + establishYear + description);
        Publisher p = new Publisher(publisherName, address, email, establishYear, description, image);
        
        PublisherDAO pd = new PublisherDAO();
        pd.insert(p);
        
        resp.sendRedirect("/TangKinhCac/admin/publishers");
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
