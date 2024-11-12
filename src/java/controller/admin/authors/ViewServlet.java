/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.admin.authors;

import Models.DAOs.AuthorDAO;
import Models.Entities.Author;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author VIET
 */
@WebServlet(urlPatterns = {"/admin/authorsView/*"})
public class ViewServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String path = req.getPathInfo();
        int authorID = Integer.parseInt(path.split("/")[1]);
        
        AuthorDAO ad = new AuthorDAO();
        Author a = ad.getOne(authorID);
        
        req.setAttribute("a", a);
        req.getRequestDispatcher("/admin/authors/view.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String path = req.getPathInfo();
        int authorID = Integer.parseInt(path.split("/")[1]);
        
        AuthorDAO ad = new AuthorDAO();
        Author a = ad.getOne(authorID);
        
        req.setAttribute("a", a);
        req.getRequestDispatcher("/admin/authors/view.jsp").forward(req, resp);
    }
    
}
