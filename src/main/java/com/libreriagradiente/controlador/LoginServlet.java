/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.libreriagradiente.controlador;

import com.libreriagradiente.DAO.usuariosDAO;
import com.libreriagradiente.modelo.usuarios;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Oscar
 */
public class LoginServlet extends HttpServlet {

    usuariosDAO udao = new usuariosDAO();
    usuarios us = new usuarios();
    
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        HttpSession session = request.getSession();
        String signin = request.getParameter("signin");
        if(signin.equalsIgnoreCase("IniciarSesion")){
            String uemail=request.getParameter("username");
            String uppassword=request.getParameter("password"); 
            us=udao.validar(uemail, uppassword);
            if(us.getEmail()!=null){
                session.setAttribute("email", us.getEmail());
                request.setAttribute("nom", us);
                request.getRequestDispatcher("Controlador?signin=protegido").forward(request, response);
        
            }else{
              
            request.getRequestDispatcher("login.jsp").forward(request, response);
            
        }
        
    }else{}}

    
    
    
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
