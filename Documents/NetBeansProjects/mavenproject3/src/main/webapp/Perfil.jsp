<%-- 
    Document   : Perfil
    Created on : 07-jun-2023, 5:08:43
    Author     : Oscar

    Este jsp muestra los atributos que editamos en el jsp de EditarPerfil. En Perfil.jsp se presentan todos estos atributos considerando 
    un diseño de dos columnas
--%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Perfil de Usuario</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body {
                background-color: #ffffff;
            }
            .profile-left {
                background-color: #1c1c1c;
                color: #ffffff;
                height: 100vh;
                <%-- 
    Si deseas que ocupe toda la altura de la página  --%>
                padding: 20px 20px 0px 20px;
            }
            .profile-right {
                background-color: whitesmoke;
                color: #000000;
                height: 100vh;
                <%-- Si deseas que ocupe toda la altura de la página  --%>
                padding: 20px 20px 0px 20px;
            }
        </style>
    </head>
    <body>
            <div class="container-fluid">
                <div class="row">




                    <div class="col-lg-3 profile-left">
                        <div class="text-center">
                            <img src="img/perfilDefault.jpeg" alt="libreria" class="img-fluid rounded-circle" style="height: 20vh;">
                            <p class="lead">Foto Perfil</p>   
                        </div>
                        <br>
                        <h2 class="text-center">Datos del Usuario</h2>
                        <br>
                        <a>Meta de lecturas este año:
                            <% 
                            
                            out.print(request.getAttribute("met")+" libros");
                        
                        
                            %>

                        </a>
                        <br>
                        <a>Nombre:                                                    <% 
                            out.print(request.getAttribute("nom"));
               
                            %>
 
                        </a>
                        <br>
                        <a>Nickname:
                                                   <% 
                            out.print(request.getAttribute("nick"));
               
                            %>
                        
                        </a>
                        <br>
                        <a>Correo: <%
                            HttpSession sesion=request.getSession();
                            String correo = (String)sesion.getAttribute("email");
                            out.println(correo);
                            %></a>


                        <div class=" text-center">
                            <br>
                            <a class="btn btn-outline-light" href="EditarPerfil.jsp" >Editar Perfil</a>
                        </div>
                    </div>

                    <div class="col-lg-9 profile-right">
                        <div class="pb-2 mb-3 border-bottom">
                            <h2 class="text-center">Descripción del Usuario</h2>
                            <br>
                            <h5>
                                <%     
                                if(request.getAttribute("descripcion")==null){
                                out.print("Añade una descripcion tuya");
                                    }
                                    else if(request.getAttribute("descripcion")!=null)
                                    out.print(request.getAttribute("descripcion"));
                                
                                %>
                                
                            </h5>
                            <br>
                        </div>
                        <div class="pb-2 mb-3 border-bottom">
                            <h2 class="text-center">Generos favoritos</h2>
                            <br>
                            <h5>
                                                                <%     
                                if(request.getAttribute("gen")==null){
                                out.print("Agrega tus generos favoritos");
                                    }
                                    else if(request.getAttribute("gen")!=null)
                                    out.print(request.getAttribute("gen"));
                                
                                %>
                            </h5>
                            <br>
                        </div>
                        <div>
                            <h2 class="text-center" >Preferencias de Lecturas</h2>
                            <br>
                            <h5 >
                                
                                <%     
                                if(request.getAttribute("pref")==null){
                                out.print("Describe tus preferencias a la hora de leer");
                                    }
                                    else if(request.getAttribute("pref")!=null)
                                    out.print(request.getAttribute("pref"));
                                
                                %>

                                </h5>
                            <br>
                        </div>
                    </div>

                </div>
            </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>
