

<%
	if(session.getAttribute("email")==null){
		response.sendRedirect("index.jsp");
	}
%>
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
          <a class="btn btn-outline-light" aria-current="page" href="Controlador?signin=MiLibreria&accion=Listar"target="myframe">Mi libreria</a>
        </li>
        <li class="nav-item">
          <a class="btn btn-outline-light" href="Controlador?signin=BuscarLibro" target="myframe">Buscar Libro</a>
        </li>

        <li class="nav-item">
          <a class="btn btn-outline-light" href="Controlador?signin=SolicitarLibro" target="myframe">Solicitar libro</a>
        </li>
        
        <li class="nav-item">
            <a class="btn btn-outline-light" href="Controlador?signin=EscribirResena" target="myframe">Escribir Reseña</a>
        </li>
        
    
    <button class="navbar-toggler bg-white" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
      <div class="offcanvas-header">
        <h5 class="offcanvas-title" id="offcanvasNavbarLabel">${nom.getNombreU()}</h5>
        <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
      </div>
      <div class="offcanvas-body">
        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Perfil</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Cerrar Sesion</a>
          </li>
          <form action="LogoutServlet" method="get">
          <button name="accion" value="salir" class="dropdown-item" href="#">Cerrar Sesion</button>
          </form>
         </ul>
        <form class="d-flex mt-3" role="search">
          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
      </div>
    </div>
  </div>
</nav>

        <div class="m-4" style="height: 80vh; padding-top: 50px">
            <iframe name="myframe" style="height: 100%; width: 100%;
                    border-width: 5px; border-style: solid; border-color: black">
                
            </iframe>
        </div>
    
    
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>