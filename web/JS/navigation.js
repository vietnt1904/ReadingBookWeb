// Define a custom HTML element called <navigation-component>
class NavigationComponent extends HTMLElement {
    constructor() {
        super();
        this.attachShadow({mode: 'open'});
        this.shadowRoot.innerHTML = `
                <link rel="stylesheet" href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css"/>
                <div class="space-x-5 text-center pb-10">
                    <a href="/TangKinhCac/admin/books">Books</a>
                    <a href="/TangKinhCac/admin/authors">Authors</a>
                    <a href="/TangKinhCac/admin/publishers">Publishers</a>
                    <a href="/TangKinhCac/admin/categories">Categories</a>
                    <a href="/TangKinhCac/admin/accounts">Accounts</a>
                    <a href="/TangKinhCac/logout">Logout</a>
                </div>
        `;
    }

}

// Register the custom element
customElements.define('navigation-component', NavigationComponent);
