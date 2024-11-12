<%-- 
    Document   : authors
    Created on : Nov 10, 2024, 2:34:50 PM
    Author     : VIET
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin | Authors</title>
        <link rel="stylesheet" href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css"/>
    </head>
    <body class="py-10">
        <div class="space-x-5 text-center pb-10">
            <a href="/TangKinhCac/admin/books">Books</a>
            <a href="/TangKinhCac/admin/authors">Authors</a>
            <a href="/TangKinhCac/admin/publishers">Publishers</a>
            <a href="/TangKinhCac/admin/categories">Categories</a>
            <a href="/TangKinhCac/admin/accounts">Accounts</a>
            <a href="/TangKinhCac/logout">Logout</a>
        </div>

        <div class="bg-white shadow border rounded-lg p-6 max-w-screen-xl mx-auto mt-10">
            <button onclick='window.history.go(-1);' class="flex items-center">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="lucide lucide-arrow-left-to-line"><path d="M3 19V5"/><path d="m13 6-6 6 6 6"/><path d="M7 12h14"/></svg>
                <p>Back
            </button>
            <div class="flex items-center justify-between py-2">
                <h2 class="text-xl font-semibold mb-4">Authors List</h2>
                <a href="/TangKinhCac/admin/authors/create.jsp" class="block p-2 bg-black text-white rounded-md">Create new Author</a>
            </div>
            <div class="overflow-x-auto">
                <table class="min-w-full divide-y divide-gray-200 h-2/3 overflow-y-scroll">
                    <thead class="bg-gray-50">
                        <tr>
                            <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">STT</th>
                            <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Image</th>
                            <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">Name</th>
                            <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider"></th>
                        </tr>
                    </thead>
                    <tbody class="bg-white divide-y divide-gray-200">
                        <c:forEach items="${list}" var="a">
                            <tr>
                                <td class="px-6 py-4 whitespace-nowrap">${list.indexOf(a) + 1}</td>
                                <td class="px-6 py-4 whitespace-nowrap">
                                    <img class="w-20 h-20 rounded-md" src="${a.image}" alt="alt"/>
                                </td>

                                <td class="px-6 py-4 whitespace-nowrap">${a.authorName}</td>
                                <td>
                                    <a href="/TangKinhCac/admin/authorEdit/${a.authorID}">Edit</a>
                                </td>
                                <td>
                                    <form action="/TangKinhCac/admin/authorsView/${a.authorID}" method="POST">
                                        <input name="authorID" value="${a.authorID}" hidden="true" />
                                        <button type="submit">View</button>
                                    </form>
                                </td>
                                <td>
                                    <form action="/TangKinhCac/admin/authorID" method="POST">
                                        <input name="authorID" value="${a.authorID}" hidden="true" />
                                        <button type="submit">Delete</button>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
