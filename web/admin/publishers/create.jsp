<%-- 
    Document   : create.jsp
    Created on : Nov 9, 2024, 3:23:05 PM
    Author     : VIET
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create new Publisher</title>       
        <link rel="stylesheet" href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css"/>
        <script src="./../../JS/navigation.js" type="text/javascript" defer></script>
    </head>
    <body class="py-10 min-h-screen">

    <navigation-component></navigation-component>
    <form action="create" method="POST" enctype="multipart/form-data" class="border shadow p-5 rounded-md max-w-screen-md mx-auto space-y-3">
        <button onclick='window.history.go(-1);' class="flex items-center">
            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="lucide lucide-arrow-left-to-line"><path d="M3 19V5"/><path d="m13 6-6 6 6 6"/><path d="M7 12h14"/></svg>
            <p>Back
        </button>

        <h2 class="text-2xl font-semibold">Create new Publisher</h2>

        <div class="space-y-3">
            <div>
                <label class=" block pb-2">Publisher Name </label>
                <input name="publisher-name" value="" required="true" placeholder="Publisher Name" 
                       class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60"/>
            </div>
            
            <div>
                <label class=" block pb-2">Publisher Address </label>
                <input name="publisher-address" value="" required="true" placeholder="Publisher Address" 
                       class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60"/>
            </div>
            
            <div>
                <label class=" block pb-2">Publisher Email </label>
                <input name="publisher-email" value="" required="true" placeholder="Publisher Email" 
                       class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60"/>
            </div>
            
            <div class="grid grid-cols-2 gap-3">
                <div>
                    <label class="block pb-2">Establish Year</label>
                    <input type="text" required="true" placeholder="100.000" name="publisher-establishYear" 
                           class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60"/>
                </div>
                <div>
                    <label class="block pb-2">Image</label>
                    <input type="file" name="publisher-image" 
                           class="w-full border-2 outline-none rounded-sm border-black/60"/>
                </div>
            </div>
            
            <div>
                <label class=" block pb-2">Description </label>
                <textarea name="book-description" value="" required="true" 
                          class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60" 
                          placeholder="Write somethings about this publisher"></textarea>
            </div>

        </div>
        <input class="bg-black p-2 text-white rounded-md cursor-pointer" type="submit" value="Create" />
    </form>
</body>
</html>
