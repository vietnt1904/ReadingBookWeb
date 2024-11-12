/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.admin.categories;

import Models.DAOs.CategoryDAO;
import Models.Entities.Category;
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
@WebServlet(urlPatterns = {"/admin/categories/create"})
@MultipartConfig
public class CreateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");

        String categoryName = name((String) req.getParameter("category-name"));
        String description = name((String) req.getParameter("category-description"));

        Category c = new Category(categoryName, description);

        CategoryDAO cd = new CategoryDAO();
        cd.insert(c);

        resp.sendRedirect("/TangKinhCac/admin/categories");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.print("doGet");
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
