package com.example.lab9_20197122.servlets;

import com.example.lab9_20197122.beans.Usuario;
import com.example.lab9_20197122.daos.UsuarioDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/"})
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

        UsuarioDao usuarioDao = new UsuarioDao();

        String email = request.getParameter("correo");
        String password = request.getParameter("password");

        Usuario usuario = usuarioDao.validarUsuario(email, password);

        if(usuario != null){
            request.getSession().setAttribute("usuarioSesion", usuario);

            if(usuario.getRol().getIdRol() == 1){
                response.sendRedirect(request.getContextPath()+"/admin");
            } else if(usuario.getRol().getIdRol() == 2){
                response.sendRedirect(request.getContextPath()+"/user");
            }


        }else{
            request.setAttribute("error", "Usuario o contraseña incorrectos");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }




    }



}
