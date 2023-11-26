package com.example.lab9_20197122.servlets;

import com.example.lab9_20197122.beans.Usuario;
import com.example.lab9_20197122.daos.DecanoDao;
import com.example.lab9_20197122.daos.DocenteDao;
import com.example.lab9_20197122.daos.UsuarioDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MainServlet", value = "/principal")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioSesion");

        String action = request.getParameter("action") == null ? "index" : request.getParameter("action");
        UsuarioDao usuarioDao = new UsuarioDao();
        DecanoDao decanoDao = new DecanoDao();
        DocenteDao docenteDao = new DocenteDao();
        RequestDispatcher view;

        switch (action){
            case "index":
                if(usuario.getRol().getIdRol() == 1){
                    view = request.getRequestDispatcher("lista-cursos.jsp");
                    view.forward(request, response);
                } else if(usuario.getRol().getIdRol() == 2){
                    view = request.getRequestDispatcher("lista-evaluaciones.jsp");
                    view.forward(request, response);
                }
                break;

            case "registroDocente":
                view = request.getRequestDispatcher("registro-docente.jsp");
                view.forward(request, response);
                break;

            case "registroCurso":
                view = request.getRequestDispatcher("registro-curso.jsp");
                view.forward(request, response);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
