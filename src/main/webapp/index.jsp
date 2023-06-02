<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
<link href="css/estilo_index.css" rel="stylesheet" />
<link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
<link rel="stylesheet" href="alert/dist/sweetalert.css">


    <script type="text/javascript" src="js/validacion.js">
	</script>
</head>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status") %>">

    <nav>
        <ul>
            <li><a href="#section1">INICIO</a></li>
            <li><a href="#section2">CATALOGO</a></li>
            <li><a href="#contacto">CONTACTO</a></li>
            <li><a href="login.jsp">INGRESAR</a></li>
        </ul>
    </nav>

    <section class="seccion1" id="section1">
        <div class="titulo">
            <br>
            Bienvenido a Gradiente.
        </div>   
         <div class="presentacion">
            <br>
            Te ayuda a administrar tus lecturas favoritas
            <br>
            y crear una libreria personalizada con tu lista de deseos
            <br><br>
            Gradiente tiene una extensa lista de 
            <br>
            titulos y además cuenta con reseñas de la comunidad.
        </div>
        <div class="botonera">
            <a href="login.jsp" class="button">Iniciar Sesion </a> 
            <a href="Registration.jsp" class="button">Registrarse </a>
        </div>
        

    </section>
    
    <section class="seccion2" id="section2">
        <h2>Gradiente cuanta con un amplio Catalogo de libros ordenado por categorias el cual dia a dia va creciendo</h2>
        <div id="bloque1">
            <div class="card"
                data-aos="fade-right"
                data-aos-duration="2000">
                
                <div class="card-body">
                    
                    <div id="galeria">
                        <img src="img/foto12.png">
                        <img src="img/foto13.png">
                        <img src="img/foto14.png">
                        <img src="img/foto15.png">
                    </div>
                    
                </div>
            </div>
        </div>

        <div id="bloque2">
            
            
            <div class="card"
                data-aos="fade-left"
                data-aos-duration="2000">
                
                <div class="card-body">
                    
                    <div id="galeria">
                        <img src="img/foto16.png">
                        <img src="img/foto17.png">
                        <img src="img/foto18.png">
                        <img src="img/foto19.png">
                        <img src="img/foto20.png">
                    </div>
                    
                </div>
            </div>
        </div>
    </section>
    <section class="seccion4">
       
        <div class="card"
        data-aos="zoom-in"
        data-aos-duration="2000">
       
            <div class="card-body">   
                <div id="galeria">
                    <img src="img/foto21.png">
                    <img src="img/foto22.png">
                    <img src="img/foto23.png">
                    <img src="img/foto24.png">
                    <img src="img/foto25.png">
                    <img src="img/foto26.png">
                </div>
            </div>
        </div>
    </section>







	
	
	
	<section class="seccion7" id="contacto">
	                <div class="letra">
                    Puedes contactarnos 
                </div>
	<form action="IngresarServlet" method="POST" id="contacto-frm" name="contacto_frm">
        

            

                <table>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtnombre" id="nombre" placeholder="Ingrese su nombre" required></td>
                    </tr>
                    <tr>
                        <td>Correo</td>
                        <td><input type="email" name="txtemail" id="email" placeholder="usuario@dominio.com"></td>
                    </tr>
                    <tr>
                        <td>Comentario</td>
                        <td><textarea name="comentario" id="comentario" cols="30" rows="10" 
                        placeholder="Ingrese un comentario"></textarea></td>
                        <tr></tr>
                        <td></td>
                        <td><input type="submit" name="enviar" id="enviar" class="cambio" value="Enviar">
                            <input type="button" name="limpiar" id="limpiar" value="Limpiar" class="cambio"></td>
                    </tr>
                </table>
            
 
    </form>
    </section>
	
	
	
	
	
	
	<section class="seccion8">
            <div id="letraUbi">
                <p> Encuentranos en: General Mackenna 001, Valparaiso</p>
            </div>
            <div id="img_ubi"></div>
            
            
            
    </section>
        
        <footer>
        <div class="cajapie">
            <p>Oscar Acuña <br> 2023</p>
        </div>
    </footer>    
        
		<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script src="https://unpkg.com/aos@next/dist/aos.js"></script>
        <script>
        AOS.init();
        </script>
<script type="text/javascript">
	var status = document.getElementById("status").value;
	if(status == "success"){
		swal("Listo","Comentario Enviado","success");
	}
</script>

	
</body>
</html>