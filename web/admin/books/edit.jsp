<%-- 
    Document   : edit
    Created on : Nov 13, 2024, 1:12:16 AM
    Author     : VIET
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Book</title>       
        <link rel="stylesheet" href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css"/>
        <script src="./../../JS/navigation.js" type="text/javascript" defer></script>
        <script>
            // Hàm xử lý sự kiện thay đổi lựa chọn trong <select>
            function addNewPublisher() {
                const selectElement = document.getElementById("publisher");
                const selectedValue = selectElement.value;
                // Kiểm tra xem người dùng có chọn "Thêm mới" không
                if (selectedValue === "addNewPublisher") {
                    // Chuyển hướng đến trang thêm mới (ví dụ: "add.html")
                    window.location.href = "/TangKinhCac/admin/publishers/create.jsp"; // Thay "add.html" bằng URL của trang thêm mới
                }
            }

            function addNewAuthor() {
                const selectElement = document.getElementById("author");
                const selectedValue = selectElement.value;
                // Kiểm tra xem người dùng có chọn "Thêm mới" không
                if (selectedValue === "addNewAuthor") {
                    // Chuyển hướng đến trang thêm mới (ví dụ: "add.html")
                    window.location.href = "/TangKinhCac/admin/authors/create.jsp"; // Thay "add.html" bằng URL của trang thêm mới
                }
            }

            function addNewCategory() {
                const selectElement = document.getElementById("category");
                const selectedValue = selectElement.value;
                // Kiểm tra xem người dùng có chọn "Thêm mới" không
                if (selectedValue === "addNewCategory") {
                    // Chuyển hướng đến trang thêm mới (ví dụ: "add.html")
                    window.location.href = "/TangKinhCac/admin/categories/create.jsp"; // Thay "add.html" bằng URL của trang thêm mới
                }
            }

        </script>
    </head>
    <body class="py-10 min-h-screen">

    <navigation-component></navigation-component>
    <form id="bookForm" action="${b.getBookID()}" method="POST" enctype="multipart/form-data" class="border shadow p-5 rounded-md max-w-screen-md mx-auto space-y-3">
        <button onclick='window.history.go(-1);' class="flex items-center">
            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="lucide lucide-arrow-left-to-line"><path d="M3 19V5"/><path d="m13 6-6 6 6 6"/><path d="M7 12h14"/></svg>
            <p>Back
        </button>

        <h2 class="text-2xl font-semibold">Edit Book</h2>

        <div class="space-y-3">
            <div>
                <label class=" block pb-2">Book Title </label>
                <input name="book-name" value="${b.getBookName()}" required="true" placeholder="Book Title" 
                       class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60"/>
            </div>
            <div>
                <label class=" block pb-2">Other Book Title </label>
                <textarea name="book-otherName" rows="3"
                          class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60" >${b.getOtherName()}</textarea>
            </div>

            <div class="grid grid-cols-2 gap-4">
                <div>
                    <label class="block pb-2">Author</label>
                    <select name="book-author" id="author" onchange="addNewAuthor()" required
                            class="w-full border-2 border-black/60 px-2 py-1 rounded-md">
                        <c:forEach items="${as}" var="a">
                            <option <c:if test="${a.authorID == b.getAuthorID()}">selected</c:if> value="${a.authorID}">
                                ${a.authorName}
                            </option>
                        </c:forEach>
                        <option value="addNewAuthor"> + Thêm Author mới </option>
                    </select>
                </div>
                <div>
                    <label class="block pb-2">Publisher</label>
                    <!--<input type="search" id="searchInput" placeholder="Tìm kiếm..."/>-->
                    <select name="book-publisher" id="publisher" onchange="addNewPublisher()" required
                            class="w-full border-2 border-black/60 px-2 py-1 rounded-md">
                        <c:forEach items="${ps}" var="p">
                            <option <c:if test="${p.publisherID == b.getPublisherID()}">selected</c:if> value="${p.publisherID}">
                                ${p.publisherName}
                            </option>
                        </c:forEach>
                        <option value="addNewPublisher"> + Thêm Publisher mới </option>
                    </select>
                    <!--                    <ul id="dropdownList" class="dropdown-list">
                                             Options sẽ được động tạo từ thẻ select 
                                        </ul>-->
                </div>
                <!--                <script>
                                    const searchInput = document.getElementById('searchInput');
                                    const selectElement = document.getElementById('publisher');
                                    const dropdownList = document.getElementById('dropdownList');
                
                                    // Hiển thị danh sách khi bắt đầu nhập
                                    searchInput.addEventListener('focus', () => {
                                        dropdownList.style.display = 'block';
                                    });
                
                                    // Ẩn danh sách khi nhấn bên ngoài
                                    document.addEventListener('click', (event) => {
                                        if (!event.target.closest('.select-container')) {
                                            dropdownList.style.display = 'none';
                                        }
                                    });
                
                                    // Lọc danh sách options khi người dùng nhập vào
                                    searchInput.addEventListener('input', function () {
                                        const filter = searchInput.value.toLowerCase();
                                        const options = selectElement.options;
                                        dropdownList.innerHTML = ''; // Xóa danh sách cũ
                
                                        // Duyệt qua tất cả các options và tạo các item trong dropdown
                                        Array.from(options).forEach(option => {
                                            const optionText = option.textContent.toLowerCase();
                                            if (optionText.includes(filter) && filter !== '') {
                                                const li = document.createElement('li');
                                                li.textContent = option.text;
                                                li.dataset.value = option.value;
                
                                                // Khi click vào một item, gán giá trị cho input
                                                li.addEventListener('click', () => {
                                                    searchInput.value = li.textContent;
                                                    selectElement.value = li.dataset.value; // Cập nhật giá trị cho thẻ select
                                                    dropdownList.style.display = 'none'; // Ẩn danh sách sau khi chọn
                                                });
                
                                                dropdownList.appendChild(li);
                                            }
                                        });
                
                                        // Nếu không có kết quả, ẩn danh sách
                                        if (dropdownList.children.length === 0) {
                                            dropdownList.style.display = 'none';
                                        } else {
                                            dropdownList.style.display = 'block';
                                        }
                                    });
                                </script>-->
            </div>

            <!--            <div> // chưa add được category
                            <label class="block pb-2">Category</label>
                            <select name="book-category" required="true" id="category" onchange="addNewCategory()"
                                    class="w-full border-2 border-black/60 px-2 py-1 rounded-md">
                                c:forEach items="${cs}" var="c">
                                    <option value="${c.categoryID}">
            ${c.categoryName}
        </option>
    /c:forEach>
    <option value="addNewCategory"> + Thêm Category mới </option>
</select>
</div>-->

            <div>
                <label class=" block pb-2">Description </label>
                <textarea name="book-description" value="" required="true" rows="6"
                          class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60" 
                          placeholder="Write somethings about this book">${b.getDescription()}</textarea>
            </div>

            <div class="grid grid-cols-2 gap-4">
                <div>
                    <label class=" block pb-2">Publication Year </label>
                    <input name="book-publicationYear" required="true" value="${b.getPublicationYear()}"
                           class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60" 
                           placeholder="2004" />
                </div>
                <div>
                    <label class="block pb-2">Page</label>
                    <input name="book-page" required="true" value="${b.getPage()}"
                           class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60" 
                           placeholder="100" />
                </div>
            </div>

            <div class="grid grid-cols-2 gap-3">
                <div>
                    <label class="block pb-2">Price</label>
                    <input type="text" required="true" placeholder="100.000" 
                           name="book-price" value="${b.getPrice()}"
                           class="w-full border-2 px-2 py-1 outline-none rounded-md border-black/60"/>
                </div>
                <div>
                    <label class="block pb-2">Image</label>
                    <div class="flex">
                        <img class="w-20 h-20 rounded-md mr-2" id="preview" src="${b.getImage()}" alt="alt"/>
                        <input name="image" type="text" value="${b.getImage()}" hidden/>
                        <input type="file" id="image" name="book-image" onchange="previewImage()"
                               class="w-full border-2 outline-none border-black/60 h-9 rounded"/>
                    </div>
                    <script>
                        // Hàm xử lý và hiển thị ảnh khi người dùng chọn
                        function previewImage() {
                            // Lấy đối tượng file đã chọn từ input
                            const fileInput = document.getElementById('image');
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

        </div>
        <input class="bg-black p-2 text-white rounded-md cursor-pointer w-20" type="submit" value="Save" />
        <input class="bg-black p-2 text-white rounded-md cursor-pointer w-20 ml-5" 
               onclick='window.history.go(-1);' type="button" value="Exit" />
    </form>
</body>
</html>
