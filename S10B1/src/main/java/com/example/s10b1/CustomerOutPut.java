package com.example.s10b1;



import com.example.s10b1.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CustomerList", value = "/customer-list")
public class CustomerOutPut extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        request.setAttribute("Customer", CustomerService.customerList);

        request.getRequestDispatcher("/Result.jsp").forward(request,response);
    }

    public void destroy() {
    }
}