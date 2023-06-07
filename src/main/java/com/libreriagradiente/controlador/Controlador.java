package com.libreriagradiente.controlador;

import com.libreriagradiente.DAO.libroDAO;
import com.libreriagradiente.DAO.libroDeseoDAO;
import com.libreriagradiente.DAO.libroLeidosDAO;
import com.libreriagradiente.DAO.libroLeyendoDAO;
import com.libreriagradiente.modelo.libro;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;


public class Controlador extends HttpServlet {

    libro li= new libro();
    libroDAO ldao = new libroDAO();
    libroDeseoDAO ldaoDeseo = new libroDeseoDAO();
    libroLeyendoDAO ldaoLeyendo = new libroLeyendoDAO();
    libroLeidosDAO ldaoLeidos = new libroLeidosDAO();
    int idl;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String signin = request.getParameter("signin");
        String accion=request.getParameter("accion");
        
        if(signin.equals("usua")){
           
            request.getRequestDispatcher("principal.jsp").forward(request,response);
        }
        if(signin.equals("Admin")){
            request.getRequestDispatcher("principal2.jsp").forward(request,response);
        }
        
        
        if(signin.equals("MiLibreria")){
            switch(accion){
                case "Listar":
                    List lista=ldao.listar();
                    request.setAttribute("libros",lista);
                    break;
                case "Agregar":
                    String nomL=request.getParameter("nombreLibro");
                    String edit=request.getParameter("Editorial");
                    String tema=request.getParameter("tema");
                    String idioma=request.getParameter("idiomaLibro");
                    String idau=request.getParameter("idAutor");
                    
                    System.out.println("nomL: "+nomL);
                    System.out.println("edit: "+edit);
                    System.out.println("tema: "+tema);
                    System.out.println("idioma: "+idioma);
                    System.out.println("idau: "+idau);
                    
                    li.setNombrelibro(nomL);
                    li.setEditorial(edit);
                    li.setTema(tema);
                    li.setIdiomaLibro(idioma);
   //                 li.setAutor(idau);
                    ldao.agregar(li);
                    
                   request.getRequestDispatcher("Controlador?signin=MiLibreria&accion=Listar").forward(request, response);
                    
                    break;
                case "Editar":
                    idl=Integer.parseInt(request.getParameter("id"));
                    libro l =ldao.listarId(idl);
                    request.setAttribute("libro",l);
                    request.getRequestDispatcher("Controlador?signin=MiLibreria&accion=Listar").forward(request, response); 
                    break;
                case "Actualizar":
                    String nomL1=request.getParameter("nombreLibro");
                    String edit1=request.getParameter("Editorial");
                    String tema1=request.getParameter("tema");
                    String idioma1=request.getParameter("idiomaLibro");
                    String idau1=request.getParameter("idAutor");
                    li.setNombrelibro(nomL1);
                    li.setEditorial(edit1);
                    li.setTema(tema1);
                    li.setIdiomaLibro(idioma1);
  //                  li.setIdAutor(idau1);
                    li.setId(idl);
                    ldao.actualizar(li);
                  
                    request.getRequestDispatcher("Controlador?signin=MiLibreria&accion=Listar").forward(request, response); 
                    break;
                case "Delete":
                   idl=Integer.parseInt(request.getParameter("id"));
                   ldao.delete(idl);
                   request.getRequestDispatcher("Controlador?sigin=MiLibreria&accion=Listar").forward(request, response); 
                    break;

                
                default:
                    throw new AssertionError();
                
            }
            request.getRequestDispatcher("MiLibreria.jsp").forward(request,response);
        }
        if(signin.equals("Perfil")){
            request.getRequestDispatcher("Perfil.jsp").forward(request,response);
        }
        if(signin.equals("BuscarLibro")){
            request.getRequestDispatcher("BuscarLibro.jsp").forward(request,response);
        }
        if(signin.equals("SolicitarLibro")){
            request.getRequestDispatcher("SolicitarLibro.jsp").forward(request,response);
        }
        if(signin.equals("EscribirResena")){
            request.getRequestDispatcher("RegistarVenta.jsp").forward(request,response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
