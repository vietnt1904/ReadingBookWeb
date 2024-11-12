/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.admin.publishers;

import Models.DAOs.CategoryDAO;
import Models.DAOs.PublisherDAO;
import Models.Entities.Category;
import Models.Entities.Publisher;
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
@WebServlet(urlPatterns = {"/admin/publishers"})
public class ListServlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        PublisherDAO cd = new PublisherDAO();
        List<Publisher> list = cd.getAllPublishers();

        req.setAttribute("list", list);
        req.getRequestDispatcher("publishers.jsp").forward(req, resp);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        PublisherDAO cd = new PublisherDAO();
        List<Publisher> list = cd.getAllPublishers();

        req.setAttribute("list", list);
        req.getRequestDispatcher("publishers.jsp").forward(req, resp);
    }
    
}
