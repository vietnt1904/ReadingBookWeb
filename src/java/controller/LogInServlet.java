/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Models.DAOs.BookDAO;
import Models.DAOs.UserDAO;
import Models.Entities.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author VIET
 */
@WebServlet(urlPatterns = {"/login"})
public class LogInServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HttpSession httpSession = req.getSession();
        String phone = req.getParameter("phone");
        String pw = req.getParameter("password");
        
        PrintWriter out = resp.getWriter();
        out.println(phone + " " + pw);
        
        UserDAO ud = new UserDAO();
        User u = ud.getUserByPhone(phone);
        out.println(u.getPhoneNumber() + " " + u.getPassword());
        
        if (u.getPassword().equals(pw)) {

            httpSession.setAttribute("phone", u.getPhoneNumber());
            httpSession.setAttribute("role", u.getRoleID());

            if (u.getRoleID() == 1 || u.getRoleID() == 3) {
                resp.sendRedirect("/TangKinhCac/admin/books");
            } else {
//                BookDAO bd = new BookDAO();
//                List list = bd.getAllBooks();
//                req.setAttribute("list", list);
                req.getRequestDispatcher("/home").forward(req, resp);
            }
        } else {
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
    
}
