<%-- 
    Document   : Index
    Created on : 07-jun-2023, 15:58:34
    Author     : Oscar


    Esta es la primera vista de la pagina, es el index.jsp el cual nos da una bienvenida y nos presenta lo que es el proyecto
--%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
        <meta charset="UTF-8">
        <title>Librería Gradiente</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">





        <!-- Otros links... -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.css" rel="stylesheet">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.js"></script>
        <style>
            body {
                padding-top: 70px;
                background: rgb(2,0,36);
                background: linear-gradient(159deg, rgba(2,0,36,1) 0%, rgba(9,9,121,1) 69%, rgba(0,212,255,1) 100%);
                color:whitesmoke;
            }

            .navbar, .navbar-brand, .nav-link {
                color: #ffffff;
            }

            .navbar {
                background-color: #1c1c1c;
            }

            .nav-link:hover, .navbar-brand:hover {
                color: #ddd;
            }

            .section {
                padding: 50px 0;
            }

            .section h2, .section p, .section form {
                text-align: center;
            }

            .imagen-ajustada {
                height: 80vh; 
                display: block; /* Esto es para que la imagen no tenga margen blanco alrededor */
                margin: 0 auto; /* Centrar la imagen en su contenedor */
            }



        </style>
    </head>
    <body>

        <nav class="navbar navbar-expand-lg fixed-top">
            <a class="navbar-brand">Librería Gradiente</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#home">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#bookstore">Librería</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#contact">Contacto</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="login.jsp">Iniciar Sesión</a>
                    </li>
                </ul>
            </div>
        </nav>



        <div class="section" id="home">
            <div class="container my-5">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h1>Bienvenido a Gradiente</h1>
                        <p class="lead">Tu lugar favorito para administrar tus lecturas.</p>
                        <br>
                        <img src="img/fondo1.jpeg" alt="libreria" class="img-fluid rounded-circle" style="height: 30vh;">
                    </div>
                </div>
            </div>
            <div class="container">
                <h5 class="mb-4 text-center">Te ayuda a administrar tus lecturas favoritas y crear una librería personalizada con tu lista de deseos.</h5>
                <h5 class="mb-4 text-center">Puedes crear listas de lectura y además ver reseñas de la comunidad.</h5>
                <br>
                <div class="text-center mt-1">
                    <a href="login.jsp" class="btn btn-light btn-lg">Iniciar Sesión</a>
                    <a href="Registration.jsp" class="btn btn-light btn-lg">Registrarse</a>
                </div>
            </div>

        </div>

        <div class="section" id="bookstore">
            
            <h5 class="mb-4 mt-4 text-center">Puedes incluir diferentes libros en tu biblioteca y categorizarlos</h5>
            <div class="container">
                <div class="row">
                    <% 
                        for(int col = 0; col < 3; col++) {
                    %>
                    <div class="col-md-4">
                        <div id="bookstoreCarousel<%= col+1 %>" class="carousel slide carousel-fade" data-ride="carousel">
                            <div class="carousel-inner">
                                <% 
                                    for(int i = 1 + col*8; i <= 8 + col*8; i++) {
                                %>
                                <div class="carousel-item<%= i==(1 + col*8) ? " active" : "" %>">
                                    <img src="img/foto<%=i%>.png" class="imagen-ajustada" alt="Libro <%=i%>">
                                </div>
                                <% 
                                    }
                                %>
                            </div>
                            <a class="carousel-control-prev" href="#bookstoreCarousel<%= col+1 %>" role="button" data-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="sr-only">Previous</span>
                            </a>
                            <a class="carousel-control-next" href="#bookstoreCarousel<%= col+1 %>" role="button" data-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="sr-only">Next</span>
                            </a>
                        </div>
                    </div>
                    <% 
                        }
                    %>
                </div>
            </div>
        </div>





        <div class="section mt-5" id="contact">
            <div class="container mt-5">
                <h2 class="mb-5">Puedes contactarnos</h2>
                <div class="row">
                    <div class="col-md-6">
                        <form action="IngresarServlet" method="POST" id="contacto-frm" name="contacto_frm">
                            <div class="form-group">
                                <input type="text" class="form-control" id="nombre" name="txtnombre" placeholder="Ingrese su nombre" required>
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control" id="email" name="txtemail" placeholder="usuario@dominio.com">
                            </div>
                            <div class="form-group">
                                <textarea class="form-control" id="comentario" name="comentario" rows="3" placeholder="Ingrese un comentario"></textarea>
                            </div>
                            <div class="text-center">
                                <button type="submit" class="btn btn-light btn-lg" name="enviar" id="enviar">Enviar</button>
                                <button type="button" class="btn btn-light btn-lg" name="limpiar" id="limpiar">Limpiar</button>
                            </div>
                        </form>
                    </div>
                    <div class="col-md-6">
                        <h3 style="color: black" >En esta caja de comentarios puedes contactarnos para hacer llegar tus impresiones
                            <br> 
                            o si deseas contactarnos por cualquier razón. </h3>

                    </div>
                </div>
                <div class="text-center mt-5">
                    <p>Esta aplicación es un proyecto personal y se proporciona de la misma manera, sin garantías de ningún tipo</p>
                    <p>Para preguntas o permisos, por favor contacta a oscarboris@outlook.cl</p>
                    <p class="mt-2"> © 2023 Oscar Acuña R. Todos los derechos reservados.</p>
                </div>
            </div>
        </div>



        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>



        <script>
            $(document).ready(function () {
                AOS.init();
            });
        </script>

    </body>
</html>
