<%-- 
    Document   : EscribirResena
    Created on : 31-may-2023, 0:53:43
    Author     : Oscar
--%>
<%@ taglib uri="jakarta.tags.core" prefix="x" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Escribir Reseña</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">


        <style>
            
                    
            body{
            background-color:whitesmoke ;
            
            }
      
            .star {
                color: #ccc;
                cursor: pointer;
            }

            .star.checked {
                color: gold;
            }

            .rating-input {
                display: none;
            }
        </style>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">



    </head>
    <body>

        <div class="container my-5">
            <h2 class="mb-3 text-center" >Escribir Reseña</h2>
            <hr>
        </div>
        <div class="container my-5">


            <form action="Controlador?signin=EscribirResena" method="POST">
                <h4>Selecciona el Libro</h4>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <select id="libro" name="idLibro" class="form-control">
                            <x:forEach var="libro" items="${libross}"> <%-- deberia ser libros leidos pero para probar --%>


                                <option value="${libro.getId()}"> ${libro.getNombrelibro()} </option>


                            </x:forEach>
                        </select>
                    </div>
                </div>

        </div>






        <div class="container my-5">

            <h4>Escribe tu Reseña</h4>
            <div class="form-row">


                <div class="form-group col-12">

                    <textarea id="resena" name="resena" class="form-control" rows="5" required></textarea>
                </div>



                <%-- Calificacion de Estrellas    --%>

                <div class="form-group col-md-12 ml-auto ">
                    <label for="calificacionLibro">Calificación del Libro</label>

                    <div class="d-flex justify-content-start mt-2" id="stars">
                        <label class="star" style="font-size: 30px;">
                            <input type="radio" name="calificacionLibro" class="rating-input" value="1">
                            <i class="fa fa-star"></i>
                        </label>
                        <label class="star" style="font-size: 30px;">
                            <input type="radio" name="calificacionLibro" class="rating-input" value="2">
                            <i class="fa fa-star"></i>
                        </label>
                        <label class="star" style="font-size: 30px;">
                            <input type="radio" name="calificacionLibro" class="rating-input" value="3">
                            <i class="fa fa-star"></i>
                        </label>
                        <label class="star" style="font-size: 30px;">
                            <input type="radio" name="calificacionLibro" class="rating-input" value="4">
                            <i class="fa fa-star"></i>
                        </label>
                        <label class="star" style="font-size: 30px;">
                            <input type="radio" name="calificacionLibro" class="rating-input" value="5">
                            <i class="fa fa-star"></i>
                        </label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-primary" name="accion" value="EnviarResena">
            </div>
        </form>
    </div>


    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>


    <script>
        $(document).ready(function () {
            var $star = $('.star');

            $star.on('click', function () {
                var val = $(this).prevAll().length + 1;
                $('#calificacionLibro').val(val);
                $star.removeClass('checked');
                $(this).prevAll().addBack().addClass('checked');
            });
        });
    </script>









</body>
</html>
