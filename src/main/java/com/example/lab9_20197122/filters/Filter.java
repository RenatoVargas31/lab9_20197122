package com.example.lab9_20197122.filters;

import com.example.lab9_20197122.beans.Usuario;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(filterName = "Filter", servletNames = {"MainServlet"})
public class Filter implements jakarta.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        jakarta.servlet.Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response =(HttpServletResponse) servletResponse;

        Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioSesion");
        if(usuario == null){
            response.sendRedirect(request.getContextPath()+"/login");
        }else{
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0);
            filterChain.doFilter(request, response);
        }

    }

    @Override
    public void destroy() {
        jakarta.servlet.Filter.super.destroy();
    }
}
