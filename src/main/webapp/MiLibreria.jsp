<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Mi Librería</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <style>
                 
            body{
            background-color:whitesmoke ;
            
            }
       
            .border-right {
                border-right: 1px solid #000;
            }
        </style>
    </head>
    <body>

        <div class="container my-5">
            <h2 class="mb-3 text-center" >Mi Libreria</h2>
            <hr>
        </div>
        <div class="container mt-5">
            <div class="row">

                <div class="col-md-4 p-3 border-right">
                    <h2 class="text-center">Lista de Deseos</h2>
                    <br>
                    <h4>Tienes : <b><% out.print(request.getAttribute("deseo")); %></b> Libros en tu lista de deseos</h4>
                        
                 

                </div>
                <div class="col-md-4 p-3 border-right">
                    <h2 class="text-center">Leyendo</h2>
                    <br>

                    <h4>Tienes : <b><% out.print(request.getAttribute("leyendo")); %></b> libros leyendo Actualmente </h4>

                </div>
                <div class="col-md-4 p-3">
                    <h2 class="text-center">Leidos</h2>
                    <br>
                    <h4>LLevas : <b><% out.print(request.getAttribute("leido")); %></b> libros Leidos</h4>
                    <br>
                    <h4>Actualmente te faltan: <b><% out.print(request.getAttribute("f")); %></b> para completar tu meta</h4>
                    <br>
                    <h4>Has leido un <b> <% out.print(request.getAttribute("p")); %>  %</b>
                         del total de libros que te has propuesto</h4>


                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>













<!--
-->
