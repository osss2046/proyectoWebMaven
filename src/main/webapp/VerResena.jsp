<%-- 
    Document   : VerResena
    Created on : 07-jun-2023, 14:10:40
    Author     : Oscar
--%>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Buscar Reseñas</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">    </head>
    <body>
        <div class="container my-5">
            <h2 class="mb-3">Buscar Reseñas</h2>
            <form action="Controlador" method="POST" class="mb-5">
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="tipoBusqueda">Buscar por:</label>
                        <select id="tipoBusqueda" name="tipoBusqueda" class="form-control">
                            <option value="nombreLibro">Nombre del libro</option>
                            <option value="autor">Autor</option>

                        </select>
                    </div>
                    <div class="form-group col-md-6">
                        <label for="terminoBusqueda">Termino de búsqueda:</label>
                        <input type="text" id="terminoBusqueda" name="terminoBusqueda" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" name="accion" value="Buscar">
                </div>
            </form>
            <h2 class="mb-3">Resultados</h2>
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Nombre del libro</th>
                        <th scope="col">Autor</th>
                        <th scope="col">fecha de Resena</th>
                        <th scope="col">Usuario</th>
                        <th scope="col">Calificacion libro</th>
                        <th scope="col">Reseña</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="re" items="${resena}">
                        <tr>
                            <th scope="row">${re.getId()}</th>
                            <td>${re.getLib().getNombrelibro()}</td>
                            <td>${re.getAu().getApellidosAutor()}</td>
                            <td>${re.getFechaAgregada()}</td>
                            <td>${re.getPerfil().getNickname()}</td>
                            <td>${re.getCalificacionLibro()}/5</td>
                            <td>
                                <div>
                                    <a class="btn btn-primary viewResena" data-toggle="modal" data-target="#resenaModal" data-resena="${re.getResena()}">Ver</a>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="modal fade" id="resenaModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Reseña</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <!-- The review content will be inserted here by JavaScript -->
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- other body elements -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

        <script>
            $(document).ready(function () {
                $('.viewResena').on('click', function () {
                    var resena = $(this).attr('data-resena');
                    $('.modal-body').html(resena);
                });
            });
        </script>    </body>
</html>
