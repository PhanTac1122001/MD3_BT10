package com.example.ss9b4;


import com.example.ss9b4.entity.Product;
import com.example.ss9b4.services.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addProduct", value = "/add-product")
public class addProductServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int stock = Integer.parseInt(request.getParameter("stock"));
        String image = request.getParameter("file");


        ProductService.products.add(new Product(name, price, stock,image));

        request.setAttribute("Product", ProductService.products);
        request.getRequestDispatcher("/productList.jsp").forward(request,response);
    }

    public void destroy() {
    }
}