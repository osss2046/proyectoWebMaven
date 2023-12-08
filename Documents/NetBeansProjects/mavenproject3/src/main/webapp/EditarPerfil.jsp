<%-- 
    Document   : EditarPerfil
    Created on : 07-jun-2023, 15:58:34
    Author     : Oscar


    En esta jsp podemos editar el perfil del usuario, estos son los atributos del perfil tales como la cantidad de libros que se dispone como meta, etc.
--%>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Editar Perfil</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container my-5">
            <h2 class="mb-3">Editar Perfil</h2>
            <form action="Controlador?signin=Perfil" method="POST" class="mb-5" >

                <div class="form-group">
                    <label for="nickname">Nickname:</label>
                    <input type="text" id="nickname" name="nickname" class="form-control">
                </div>
                <div class="form-group">
                    <label for="metas">Metas de libros para leer este año:</label>
                    <input type="number" id="metas" name="metas" class="form-control">
                </div>
                <div class="form-group">
                    <label for="descripcion">Descripción del usuario:</label>
                    <textarea id="descripcion" name="descripcion" class="form-control" rows="5"></textarea>
                </div>
                <div class="form-group">
                    <label for="generosFavoritos">Géneros favoritos:</label>
                    <input type="text" id="generosFavoritos" name="generosFavoritos" class="form-control">
                </div>
                <div class="form-group">
                    <label for="preferenciasLectura">Preferencias de lectura:</label>
                    <input type="text" id="preferenciasLectura" name="preferenciasLectura" class="form-control">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" name="accion" value="ActualizarPerfil">
                    <input type="submit" class="btn btn-primary" name="accion" value="Volver">
                </div>
            </form>
        </div>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
