package com.example.lab9_20197122.servlets;

import com.example.lab9_20197122.beans.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action") == null ? "login" : request.getParameter("action");

        switch (action) {
            case "login":
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "logout":
                request.getSession().invalidate();
                response.sendRedirect(request.getContextPath()+"/login");
                break;
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Usuario usuario = new Usuario();

        String email = request.getParameter("correo");
        String password = request.getParameter("password");





    }



}
