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
import java.util.List;

/**
 *
 * @author VIET
 */
@WebServlet(urlPatterns = {"/admin/authors"})
public class ListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        AuthorDAO ad = new AuthorDAO();
        List<Author> list = ad.getAllAuthors();

        req.setAttribute("list", list);
        req.getRequestDispatcher("authors.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        AuthorDAO ad = new AuthorDAO();
        List<Author> list = ad.getAllAuthors();

        req.setAttribute("list", list);
        req.getRequestDispatcher("authors.jsp").forward(req, resp);
    }

}
