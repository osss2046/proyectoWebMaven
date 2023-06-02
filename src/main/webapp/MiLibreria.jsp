<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi Libreria</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1 class="text-center mt-5">Mi Libreria</h1>
            <form action="Controlador?signin=MiLibreria" method="POST">
                <div class="form-group">
                    <label>Nombre Libro</label>
                    <input type="text" class="form-control" value="${libro.getNombrelibro()}" name="nombreLibro" >
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
                <div class="form-group">
                    <label>Autor</label>
                    <input type="text" class="form-control" value="${libro.getIdAutor()}" name="idAutor">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" name="accion" value="Agregar">
                    <input type="submit" class="btn btn-secondary" name="accion" value="Actualizar">
                </div>
                <div>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre Libro</th>
                                <th>Editorial</th>
                                <th>Tema</th>
                                <th>Idioma Libro</th>
                                <th>Autor</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="li" items="${libros}">
                                <tr>
                                    <td>${li.getId()}</td>
                                    <td>${li.getNombrelibro()}</td>
                                    <td>${li.getEditorial()}</td>
                                    <td>${li.getTema()}</td>
                                    <td>${li.getIdiomaLibro()}</td>
                                    <td>${li.getIdAutor()}</td>
                                    <td>
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                Opciones
                                            </button>
                                            <div class="dropdown-menu">
                                                <a class="dropdown-item" href="Controlador?signin=MiLibreria&accion=Editar&id=${li.getId()}">Editar</a>
                                                <a class="dropdown-item" href="Controlador?signin=MiLibreria&accion=Delete&id=${li.getId()}">Eliminar</a>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </form>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </body>
</html>
