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
    /* Resto del código CSS... */
            background-color: #2c2c2c;
            color: #ffffff;
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

 
        

    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg fixed-top">
    <a class="navbar-brand" href="#">Librería Gradiente</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="#home">Inicio</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#about">Acerca de</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#bookstore">Librería</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#contact">Contacto</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="${loginLink}">Iniciar Sesión</a>
            </li>
        </ul>
    </div>
</nav>

<div class="section" id="home">
    <div class="container my-5">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h1>Bienvenido a Librería Gradiente</h1>
                <p class="lead">Tu lugar favorito para administrar tus lecturas.</p>
                <img src="img/fondo1.png" alt="libreria" class="img-fluid rounded-circle" style="height: 20vh;">
            </div>
        </div>
    </div>
</div>

<div class="section" id="about">
    <div class="container">
        <h2 class="mb-4">Bienvenido a Gradiente.</h2>
        <p class="mb-4">Te ayuda a administrar tus lecturas favoritas y crear una librería personalizada con tu lista de deseos.</p>
        <p class="mb-4">Gradiente tiene una extensa lista de títulos y además cuenta con reseñas de la comunidad.</p>
        <div class="text-center mt-4">
            <a href="login.jsp" class="btn btn-light btn-lg">Iniciar Sesión</a>
            <a href="Registration.jsp" class="btn btn-light btn-lg">Registrarse</a>
        </div>
    </div>
</div>

<div style="height: 20vh;"></div>

<div class="container" id="bookstore">
    
    
<div class="container" style="height: 60vh;">
    <div class="row h-100">
        <% 
            for(int col = 0; col < 3; col++) {
        %>
            <div class="col-md-4 h-100">
                <div id="bookstoreCarousel<%= col+1 %>" class="carousel slide carousel-fade h-100" data-ride="carousel">
                    <div class="carousel-inner h-100">
                        <% 
                            for(int i = 1 + col*8; i <= 8 + col*8; i++) {
                        %>
                            <div class="carousel-item<%= i==(1 + col*8) ? " active" : "" %> h-100">
                                <img src="img/foto<%=i%>.png" class="d-block w-100 h-100" alt="Libro <%=i%>">
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

<div style="height: 20vh;"></div>
<div class="section" id="contact">
    <div class="container">
        <h2 class="mb-4">Puedes contactarnos</h2>
        <div class="row">
            <div class="col-md-8">
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
            <div class="col-md-4">
                <h3 class="text-uppercase">Lorem ipsum dolor sit amet</h3>
                <p class="text-muted">Consectetur adipiscing elit. Integer posuere erat a ante.</p>
                <p><small class="text-muted">Sed posuere consectetur est at lobortis. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Maecenas faucibus mollis interdum.</small></p>
                <h4 class="text-lowercase" style="font-family: monospace;">Donec ullamcorper nulla non metus</h4>
                <p>Aenean lacinia bibendum nulla sed consectetur. Aenean lacinia bibendum nulla sed consectetur.</p>
                <p class="text-danger">Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
                <p><mark>Cras mattis consectetur purus sit amet fermentum.</mark></p>
            </div>
        </div>
    </div>
</div>

    
    
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>



<script>
    $(document).ready(function() {
        AOS.init();
    });
</script>

</body>
</html>
