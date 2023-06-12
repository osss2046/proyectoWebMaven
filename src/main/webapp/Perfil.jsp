<%-- 
    Document   : Perfil
    Created on : 07-jun-2023, 5:08:43
    Author     : Oscar
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
                padding: 20px;
            }
            .profile-right {
                background-color: #ffffff;
                color: #000000;
                height: 100vh;
                <%-- Si deseas que ocupe toda la altura de la página  --%>
                padding: 20px;
            }
        </style>
    </head>
    <body>
            <div class="container-fluid h-100">
                <div class="row h-100">




                    <div class="col-lg-3 profile-left">
                        <br>
                        <br>
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
                            out.print(request.getAttribute("Nick"));
               
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
                            <br>
                            <br>
                            <br>

                            <a class="btn btn-outline-light" href="EditarPerfil.jsp" >Editar Perfil</a>
                        </div>
                    </div>







                    <div class="col-lg-9 profile-right">
                        <div class="pb-3 mb-3 border-bottom">
                            <h2 class="text-center">Descripción del Usuario</h2>
                            <br>
                            <br>
                            <a class="col-lg-6 ">
                                
                                <%     
                                if(request.getAttribute("desc")==null){
                                out.print("Añade una descripcion tuya");
                                    }
                                    else if(request.getAttribute("desc")!=null)
                                    out.print(request.getAttribute("desc"));
                                
                                %>
                                
                            
                            </a>
                            <br>
                            <br>
                        </div>
                        <div class="pb-3 mb-3 border-bottom">
                            <h2 class="text-center">Generos favoritos</h2>
                            <br>
                            <br>
                            <a class="col-lg-6 ">
                                                                <%     
                                if(request.getAttribute("gen")==null){
                                out.print("Agrega tus generos favoritos");
                                    }
                                    else if(request.getAttribute("gen")!=null)
                                    out.print(request.getAttribute("gen"));
                                
                                %>
                                
                                
                                
                                
                            
                            
                            
                            
                            </a>
                            <br>
                            <br>
                        </div>
                        <div>
                            <h2 class="text-center" >Preferencias de Lecturas</h2>
                            <br>
                            <br>
                            <a class="col-lg-6 ">
                                
                                <%     
                                if(request.getAttribute("pref")==null){
                                out.print("Describe tus preferencias a la hora de leer");
                                    }
                                    else if(request.getAttribute("pref")!=null)
                                    out.print(request.getAttribute("pref"));
                                
                                %>
                                
                                
                                
                                
                                </a>
                            <br>
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
