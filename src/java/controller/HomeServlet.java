/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Models.DAOs.BookDAO;
import Models.DAOs.CategoryDAO;
import Models.Entities.Book;
import Models.Entities.Category;
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
@WebServlet(urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        BookDAO bd = new BookDAO();
        List<Book> lists = bd.getAllBooks();
        
        CategoryDAO cd = new CategoryDAO();
        List<Category> listCate = cd.getAllCategories();
        
        req.setAttribute("list", lists);
        req.setAttribute("listCate", listCate);
        req.setAttribute("list2", lists);
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        BookDAO bd = new BookDAO();
        List<Book> lists = bd.getAllBooks();
        
        CategoryDAO cd = new CategoryDAO();
        List<Category> listCate = cd.getAllCategories();
        
        req.setAttribute("list", lists);
        req.setAttribute("listCate", listCate);
        req.setAttribute("list2", lists);
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }
    
}
