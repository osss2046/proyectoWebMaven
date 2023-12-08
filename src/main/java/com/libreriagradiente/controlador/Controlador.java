/*
    Este es el controlador que administra todas las solicitudes y respuestas. Los action (formularios) enviaran al cada seccion del controlador y 
    este enviara al DAO correspondiente para administrar todas los response y request

 */




package com.libreriagradiente.controlador;

import com.libreriagradiente.DAO.MiLibreriaDAO;
import com.libreriagradiente.DAO.libroDAO;
import com.libreriagradiente.DAO.libroDeseoDAO;
import com.libreriagradiente.DAO.libroLeidosDAO;
import com.libreriagradiente.DAO.libroLeyendoDAO;
import com.libreriagradiente.DAO.listarUsuarioDAO;
import com.libreriagradiente.DAO.perfilDAO;
import com.libreriagradiente.DAO.resenaDAO;
import com.libreriagradiente.modelo.EstadoLectura;
import com.libreriagradiente.modelo.autor;
import com.libreriagradiente.modelo.coleccion;
import com.libreriagradiente.modelo.libro;
import com.libreriagradiente.modelo.perfil;
import com.libreriagradiente.modelo.resena;
import com.libreriagradiente.modelo.tablas;
import com.libreriagradiente.modelo.usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

public class Controlador extends HttpServlet {

    autor au = new autor();
    libro li = new libro();
    libroDAO ldao = new libroDAO();
    libroDeseoDAO ldaoDeseo = new libroDeseoDAO();
    libroLeyendoDAO ldaoLeyendo = new libroLeyendoDAO();
    libroLeidosDAO ldaoLeidos = new libroLeidosDAO();
    resena res = new resena();
    resenaDAO resDAO = new resenaDAO();

    perfil per = new perfil();
    perfilDAO pdao = new perfilDAO();
    MiLibreriaDAO MilDAO = new MiLibreriaDAO();
    EstadoLectura Estl = new EstadoLectura();
    listarUsuarioDAO lusdao = new listarUsuarioDAO();

    int idl;
    int idusu;
    String nombreusu;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String signin = request.getParameter("signin");

        String accion = request.getParameter("accion");

        if (signin.equals("usua")) {
            idusu = (int) request.getAttribute("usua2");

            usuarios u = new usuarios();
            u = (usuarios) request.getAttribute("nomusu");
            nombreusu = u.getNombreU();

            request.getRequestDispatcher("principal.jsp").forward(request, response);
        }
        if (signin.equals("Admin")) {
            idusu = (int) request.getAttribute("usua1");

            request.getRequestDispatcher("principal2.jsp").forward(request, response);
        }

        if (signin.equals("AgregarLibro")) {
            switch (accion) {
                case "Listar":
                    perfil perfil1 = new perfil();
                    pdao.obtenerDeBD(idusu, perfil1);
                    int idP = perfil1.getId();
                    List lista = ldao.listar(idP);
                    request.setAttribute("libros", lista);

                    break;

                case "Agregar":
                    String opEstado = request.getParameter("opcionEstado");
                    String nomL = request.getParameter("nombreLibro");
                    String edit = request.getParameter("Editorial");
                    String tema = request.getParameter("tema");
                    String idioma = request.getParameter("idiomaLibro");

                    String nomAutor = request.getParameter("nombreAutor");
                    String apeAutor = request.getParameter("apellidoAutor");
                    String nacionaAutor = request.getParameter("nacionalidadAutor");
                    au.setNombreAutor(nomAutor);
                    au.setApellidosAutor(apeAutor);
                    au.setNacionalidad(nacionaAutor);

                    li.setEstadoLectura(Integer.parseInt(opEstado));
                    li.setNombrelibro(nomL);
                    li.setEditorial(edit);
                    li.setTema(tema);
                    li.setIdiomaLibro(idioma);
                    String para = ldao.Existe(li);
                    System.out.println("el nombre del libro parametro (si existe) es : " + para);
                    if (para == null) {
                        li = ldao.agregar(li);
                        int idLibro = ldao.idLibro(li);

                        au = ldao.agregarAu(idLibro, au);
                        perfil perfil2 = new perfil();
                        pdao.obtenerDeBD(idusu, perfil2);
                        int idPerfil = perfil2.getId();
                        coleccion cole = new coleccion();

                        cole = ldao.CrearColeccion(idLibro, idPerfil);
                    }
                    request.getRequestDispatcher("Controlador?signin=VerLibros&accion=Listar").forward(request, response);

                    break;

                case "Actualizar":
                    String opEstado1 = request.getParameter("opcionEstado");
                    String nomL1 = request.getParameter("nombreLibro");
                    String edit1 = request.getParameter("Editorial");
                    String tema1 = request.getParameter("tema");
                    String idioma1 = request.getParameter("idiomaLibro");
                    li.setEstadoLectura(Integer.parseInt(opEstado1));
                    li.setNombrelibro(nomL1);
                    li.setEditorial(edit1);
                    li.setTema(tema1);
                    li.setIdiomaLibro(idioma1);
                    li.setId(idl);

                    String nomAutor1 = request.getParameter("nombreAutor");
                    String apeAutor1 = request.getParameter("apellidoAutor");
                    String nacionaAutor1 = request.getParameter("nacionalidadAutor");
                    au.setNombreAutor(nomAutor1);
                    au.setApellidosAutor(apeAutor1);
                    au.setNacionalidad(nacionaAutor1);
                    li.setAutor(new autor());
                    li.getAutor().setApellidosAutor(apeAutor1);
                    li.getAutor().setNombreAutor(nomAutor1);
                    li.getAutor().setNacionalidad(nacionaAutor1);

                    li = ldao.actualizar(li);
                    int idLibro1 = li.getId();
                    ldao.actualizarAu(idLibro1, au);
                    System.out.println("autor :" + li.getAutor().getApellidosAutor());

                    request.getRequestDispatcher("Controlador?signin=VerLibros&accion=Listar").forward(request, response);
                    break;

                default:
                    throw new AssertionError();

            }
            request.getRequestDispatcher("BuscarLibro.jsp").forward(request, response);
        }
        if (signin.equals("Perfil")) {

            switch (accion) {
                case "ActualizarPerfil":
                    String nick = request.getParameter("nickname");
                    int metas = Integer.parseInt(request.getParameter("metas"));
                    String descripU = request.getParameter("descripcion");
                    String fav = request.getParameter("generosFavoritos");
                    String prefer = request.getParameter("preferenciasLectura");
                    per.setNickname(nick);
                    per.setMeta(metas);
                    per.setDescripcionU(descripU);
                    per.setGenerosFav(fav);
                    per.setPreferenciasDeLec(prefer);

                    pdao.actualizar(idusu, per);
                    request.getRequestDispatcher("Controlador?signin=Perfil&accion=Obtener").forward(request, response);

                    break;

                case "Volver":
                    request.getRequestDispatcher("Controlador?signin=Perfil&accion=Obtener").forward(request, response);

                    break;
                case "Obtener":
                    perfil perfil3 = new perfil();
                    pdao.obtenerDeBD(idusu, perfil3);

                    System.out.println("el nickname es:"+perfil3.getNickname());

                    request.setAttribute("pref", perfil3.getPreferenciasDeLec());
                    request.setAttribute("gen", perfil3.getGenerosFav());
                    request.setAttribute("descripcion", perfil3.getDescripcionU());
                    request.setAttribute("nom", nombreusu);
                    request.setAttribute("met", perfil3.getMeta());
                    request.setAttribute("nick", perfil3.getNickname());

                    request.getRequestDispatcher("Perfil.jsp").forward(request, response);
                default:
                //throw new AssertionError();
            }

            request.getRequestDispatcher("Perfil.jsp").forward(request, response);
        }
        if (signin.equals("EditarPerfil")) {
            request.getRequestDispatcher("EditarPerfil.jsp");
        }

        if (signin.equals("VerLibros")) {

            switch (accion) {
                case "Listar":
                    perfil perfil4 = new perfil();
                    pdao.obtenerDeBD(idusu, perfil4);
                    int idP = perfil4.getId();
                    List lista = ldao.listarNue(idP);

                    request.setAttribute("libros", lista);

                    break;

                case "Editar":
                    idl = Integer.parseInt(request.getParameter("id"));
                    libro l = ldao.listarId(idl);
                    autor au = ldao.listarIdAu(idl);

                    request.setAttribute("libro", l);
                    request.setAttribute("autor", au);
                    request.getRequestDispatcher("Controlador?signin=AgregarLibro&accion=Listar").forward(request, response);
                    break;

                case "Delete":
                    idl = Integer.parseInt(request.getParameter("id"));
                    perfil perfil5 = new perfil();
                    pdao.obtenerDeBD(idusu, perfil5);
                    int idpe = perfil5.getId();
                    int idC = resDAO.OIdColec(idl, idpe);
                    ldao.DeleteCol(idC);
                    ldao.DeleteAuConIdLi(idl);
                    ldao.delete(idl);
                    request.getRequestDispatcher("Controlador?sigin=VerLibros&accion=Listar").forward(request, response);
                    break;

                default:

            }

            request.getRequestDispatcher("VerLibros.jsp").forward(request, response);
        }

        if (signin.equals("EscribirResena")) {
            switch (accion) {
                case "Listar":
                    perfil perfil6 = new perfil();
                    pdao.obtenerDeBD(idusu, perfil6);
                    int idPe = perfil6.getId();
                    List lista3 = ldao.listar(idPe);
                    request.setAttribute("libross", lista3);
                    request.getRequestDispatcher("Resena.jsp").forward(request, response);

                    break;
                case "EnviarResena":
                    int idLi = Integer.parseInt(request.getParameter("idLibro"));
                    perfil perfil7 = new perfil();
                    pdao.obtenerDeBD(idusu, perfil7);
                    int idP = perfil7.getId();
                    int idC = resDAO.OIdColec(idLi, idP);

                    System.out.println("id libro :" + idLi);
                    System.out.println("id perfil :" + idP);
                    System.out.println("id Coleccion :" + idC);

                    String Resena = request.getParameter("resena");
                    String Calif = request.getParameter("calificacionLibro");

                    res.setIdColeccion(idC);
                    res.setResena(Resena);
                    res.setCalificacionLibro(Integer.parseInt(Calif));
                    System.out.println("el id del libro es :" + res.getIdColeccion());
                    System.out.println("la reseña es : " + res.getResena());
                    System.out.println("la calificacion es : " + res.getCalificacionLibro());

                    resDAO.AgregarR(res);

                    request.getRequestDispatcher("Controlador?signin=VerResena&accion=Listar").forward(request, response);

                default:

            }

            request.getRequestDispatcher("Controlador?signin=EscribirResena").forward(request, response);

        }

        if (signin.equals("VerResena")) {
            List listares = resDAO.listaRes();
            request.setAttribute("resena", listares);
            request.getRequestDispatcher("VerResena.jsp").forward(request, response);

        }
        if (signin.equals("MiLibreria")) {
            perfil perfil8 = new perfil();
            pdao.obtenerDeBD(idusu, perfil8);
            int idP = perfil8.getId();
            int deseo = MilDAO.cantidad(1, idP);
            int leyendo =MilDAO.cantidad(2, idP);
            int leido = MilDAO.cantidad(3, idP);
            int m=perfil8.getMeta();
            int falt = m-leido;
            double porce=0;
            if(m!=0){
            porce = (leido*100)/m;}
            
            request.setAttribute("leyendo",leyendo);
            request.setAttribute("leido",leido);
            request.setAttribute("deseo",deseo);
            request.setAttribute("f",falt);
            request.setAttribute("p",porce);
            System.out.println(leyendo);
            System.out.println(leido);
            System.out.println(deseo);

            

            request.getRequestDispatcher("MiLibreria.jsp").forward(request, response);
        }

        if (signin.equals("ListarUsuarios")) {

            switch (accion) {
                case "Listar":

                    List listau = lusdao.listarUs();

                    request.setAttribute("usuarios", listau);

                    break;

                case "Editar":

                    idl = Integer.parseInt(request.getParameter("id"));

                    lusdao.actualizarU(idl);

                    System.out.println(idl);

                    request.getRequestDispatcher("Controlador?signin=ListarUsuarios&accion=Listar").forward(request, response);

                    break;
                case "Eliminar":
                    idl = Integer.parseInt(request.getParameter("id"));
                    lusdao.eliminarU(idl);
                    request.getRequestDispatcher("Controlador?signin=ListarUsuarios&accion=Listar").forward(request, response);

                default:
            }

            request.getRequestDispatcher("ListarUsuarios.jsp").forward(request, response);

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
