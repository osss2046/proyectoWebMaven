<%-- 
    Document   : BuscarLibro
    Created on : 31-may-2023, 0:53:26
    Author     : Oscar
--%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <%-- Este jsp es la vista del la pagina para buscar libros, en este se despliega el formulario para poder buscar un libro el cual 
    sera incorporado a las diferentes listas: deseo, leyendo o leido--%>


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi Libreria</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body{
                background-color:whitesmoke ;

            }
        </style>
    </head>




    <body>
        <div class="container">


            <form action="Controlador?signin=AgregarLibro" method="POST">

                <h1 class="text-center mt-5">Agregar un libro</h1>
                <hr>
                <br>
                <br>
                <div>
                    <div class="form-inline">
                        <div class="form-group mr-2">
                            <label for="opciones" class="mr-2">Seleccione una lista para agregar  : &nbsp &nbsp &nbsp    </label>
                            <select id="opciones" name="opcionEstado" class="form-control" required>
                                <option value="">-- Listas de Lecturas --</option>
                                <option value="1">Lista de Deseos </option>
                                <option value="2">Leyendo</option>
                                <option value="3">Leidos</option>
                            </select>
                        </div>
                    </div>
                    <br>

                </div>

                <div class="container">
                    <div class="row">
                        <div class="col-md-7">
                            <div class="form-group">
                                <label>Nombre Libro</label>
                                <input type="text" class="form-control" value="${libro.getNombrelibro()}" name="nombreLibro">
                            </div>
                            <div class="form-group">
                                <label>Editorial</label>
                                <input type="text" class="form-control" value="${libro.getEditorial()}" name="Editorial">
                            </div>
                            <div class="form-group">
                                <label>Tema</label>
                                <input type="text" class="form-control" value="${libro.getTema()}" name="tema">
                            </div>
                            <div class="form-group">
                                <label>Idioma Libro</label>
                                <input type="text" class="form-control" value="${libro.getIdiomaLibro()}" name="idiomaLibro">
                            </div>
                        </div>
                        <div class="col-md-5">
                            <div class="form-group">
                                <label>Nombrea Autor</label>
                                <input type="text" class="form-control" value="${autor.getNombreAutor()}" name="nombreAutor">
                            </div>
                            <div class="form-group">
                                <label>Apellidos Autor</label>
                                <input type="text" class="form-control" value="${autor.getApellidosAutor()}" name="apellidoAutor">
                            </div>                
                            <div class="form-group">
                                <label>Nacionalidad Autor</label>
                                <input type="text" class="form-control" value="${autor.getNacionalidad()}" name="nacionalidadAutor">
                            </div>

                        </div>
                    </div>
                    <br>
                    <br>
                    <div class="form-group text-center">
                        <input type="submit" class="btn btn-primary" name="accion" value="Agregar">
                        <input type="submit" class="btn btn-secondary" name="accion" value="Actualizar">
                    </div>

                </div>
            </form>




        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </body>
</html>