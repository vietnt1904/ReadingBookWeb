/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.admin.books;

import Models.DAOs.AuthorDAO;
import Models.DAOs.BookDAO;
import Models.DAOs.CategoryDAO;
import Models.DAOs.PublisherDAO;
import Models.Entities.Author;
import Models.Entities.Book;
import Models.Entities.Category;
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
import java.util.List;

/**
 *
 * @author VIET
 */
@WebServlet(urlPatterns = {"/admin/bookEdit/*"})
@MultipartConfig
public class EditServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String path = req.getPathInfo();
        int bookID = Integer.parseInt(path.split("/")[1]);

        String bookName = name((String) req.getParameter("book-name"));
        String otherName = (String) req.getParameter("book-otherName");
        int publisherID = Integer.parseInt(req.getParameter("book-publisher"));
        int authorID = Integer.parseInt(req.getParameter("book-author"));
//        int categoryID = Integer.parseInt(req.getParameter("book-category"));
        String description = (String) req.getParameter("book-description");
        int publicationYear = Integer.parseInt(req.getParameter("book-publicationYear"));
        int page = Integer.parseInt(req.getParameter("book-page"));
        int price = Integer.parseInt(req.getParameter("book-price"));
        String image = "";
        Part part = (Part) req.getPart("book-image");
        if (part.getSize() != 0) {
            image = image(part);
        } else {
            image = req.getParameter("image").split("data:image/jpeg;base64,")[1];
        }

        Book b = new Book(bookID, authorID, publisherID, bookName, otherName,
                 publicationYear, price, page, image, description);
        
        BookDAO bd = new BookDAO();
        bd.update(b);
        
        resp.sendRedirect("/TangKinhCac/admin/books");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String path = req.getPathInfo();
        int bookID = Integer.parseInt(path.split("/")[1]);

        BookDAO bd = new BookDAO();
        Book b = bd.getOne(bookID);

        PublisherDAO pd = new PublisherDAO();
        List<Publisher> ps = pd.getAllPublishers();

        CategoryDAO cd = new CategoryDAO();
        List<Category> cs = cd.getAllCategories();

        AuthorDAO ad = new AuthorDAO();
        List<Author> as = ad.getAllAuthors();

        req.setAttribute("ps", ps);
        req.setAttribute("cs", cs);
        req.setAttribute("as", as);
        req.setAttribute("b", b);
        req.getRequestDispatcher("/admin/books/edit.jsp").forward(req, resp);
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
