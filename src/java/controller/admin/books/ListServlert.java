/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.admin.books;

import Models.DAOs.BookDAO;
import Models.Entities.Book;
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
@WebServlet(urlPatterns = {"/admin/books"})
public class ListServlert extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("Here");

        BookDAO bd = new BookDAO();
        List<Book> list = bd.getAllBooks();

        req.setAttribute("list", list);
        req.getRequestDispatcher("books.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("Here");

        BookDAO bd = new BookDAO();
        List<Book> list = bd.getAllBooks();

        req.setAttribute("list", list);
        req.getRequestDispatcher("books.jsp").forward(req, resp);
    }

}
