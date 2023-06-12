

<%
        if(session.getAttribute("email")==null){
                response.sendRedirect("index.jsp");
        }
%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <%--
         <link href="css/estilo_index.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
        <link rel="stylesheet" href="alert/dist/sweetalert.css">


    <script type="text/javascript" src="js/validacion.js"></script>

        --%>  
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>

    </head>
    <body>

        <nav class="navbar bg-dark fixed-top">

            <div class="container-fluid text-center">  

                <li class="nav-item">
                    <a class="btn btn-outline-light" aria-current="page" href="Controlador?signin=MiLibreria"target="myframe">Mi libreria</a>
                </li>
                <li class="nav-item">
                    <a class="btn btn-outline-light" href="Controlador?signin=AgregarLibro&accion=Listar" target="myframe">Agregar Libro</a>
                </li>
                <li class="nav-item">
                    <a class="btn btn-outline-light" href="Controlador?signin=VerLibros&accion=Listar" target="myframe">ver mis Libros</a>
                </li>

                <li class="nav-item">
                    <a class="btn btn-outline-light" href="Controlador?signin=EscribirResena&accion=Listar" target="myframe">Escribir Rese�a</a>
                </li>
                
                                <li class="nav-item">
                    <a class="btn btn-outline-light" href="Controlador?signin=VerResena" target="myframe">Ver Rese�as</a>
                </li>


                <button class="navbar-toggler bg-white" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
                    <div class="offcanvas-header">
                        <h5 class="offcanvas-title" id="offcanvasNavbarLabel">${nomusu.getNombreU()}</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">

                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="Controlador?signin=Perfil&accion=Obtener" target="myframe">Perfil</a>
                            </li>

                            <form action="LogoutServlet" method="get">
                                <button name="accion" value="salir" class="dropdown-item" href="#">Cerrar Sesion</button>
                            </form>
                        </ul>

                    </div>
                </div>
            </div>
        </nav>




        <div class="m-4" style="height: 95vh; padding: 50px 10vw 0 10vw">
            <iframe name="myframe" src="Controlador?signin=Perfil&accion=Obtener" style="height: 100%; width: 100%;
                    border-width: 5px; border-style: solid; border-color: black">

            </iframe>
        </div>



        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    </body>
</html>