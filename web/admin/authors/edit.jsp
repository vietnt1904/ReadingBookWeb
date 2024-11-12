<%-- 
    Document   : edit
    Created on : Nov 12, 2024, 4:39:10 PM
    Author     : VIET
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create new Author</title>       
        <link rel="stylesheet" href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css"/>
        <script src="./../../JS/navigation.js" type="text/javascript" defer></script>
    </head>
    <body class="py-10 min-h-screen">

    <navigation-component></navigation-component>
    <form action="${a.getAuthorID()}" method="POST" enctype="multipart/form-data" class="border shadow p-5 rounded-md max-w-screen-md mx-auto space-y-3">
        <button onclick='window.history.go(-1);' class="flex items-center">
            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="lucide lucide-arrow-left-to-line"><path d="M3 19V5"/><path d="m13 6-6 6 6 6"/><path d="M7 12h14"/></svg>
            <p>Back
        </button>

        <h2 class="text-2xl font-semibold">Edit Author</h2>

        <div class="space-y-3">
            <div>
                <input name="author-name" value="${a.getAuthorName()}" placeholder="Author Name" 
                       class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60"/>
            </div>

            <div class="grid grid-cols-2 gap-3">
                <div>
                    <label class="block pb-2">Year of birth</label>
                    <input type="text" value="${a.getBirthYear()}" name="author-birthYear" 
                           class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60"/>
                </div>
                <div>
                    <label class="block pb-2">Image</label>
                    <div class="flex">
                        <img class="w-20 h-20 rounded-md mr-2" id="preview" src="${a.getImage()}" alt="alt"/>
                        <input name="image" type="text" value="${a.getImage()}" hidden/>
                        <input type="file" name="author-image" id="author-image" onchange="previewImage()"
                               class="w-full border-2 outline-none rounded border-black/60 h-9"/>
                    </div>
                    <script>
                        // Hàm xử lý và hiển thị ảnh khi người dùng chọn
                        function previewImage() {
                            // Lấy đối tượng file đã chọn từ input
                            const fileInput = document.getElementById('author-image');
                            const file = fileInput.files[0];  // Lấy file đầu tiên từ danh sách files

                            if (file) {
                                // Kiểm tra xem file có phải là ảnh hay không
                                const reader = new FileReader();

                                reader.onload = function (e) {
                                    // Khi ảnh đã được đọc, set src cho thẻ <img> để hiển thị
                                    var previewImage = document.getElementById('preview');
                                    previewImage.src = e.target.result;  // e.target.result là ảnh dưới dạng base64
                                    previewImage.style.display = 'block'; // Hiển thị ảnh
                                };

                                // Đọc file dưới dạng URL
                                reader.readAsDataURL(file);
                            }
                        }
                    </script>
                </div>
            </div>
            <div>
                <label class=" block pb-2">Description </label>
                <textarea name="author-description" rows="6"
                          class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60" 
                          placeholder="Write somethings about this author">${a.getDescription()}</textarea>
            </div>
        </div>
        <input class="bg-black p-2 text-white rounded-md cursor-pointer w-20" type="submit" value="Save" />
        <input class="bg-black p-2 text-white rounded-md cursor-pointer w-20 ml-5" 
               onclick='window.history.go(-1);' type="button" value="Exit" />
    </form>
</body>
</html>
