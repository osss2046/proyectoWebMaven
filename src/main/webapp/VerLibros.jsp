<%-- 
    Document   : VerLibros
    Created on : 07-jun-2023, 13:38:31
    Author     : Oscar

    Este jsp despliega una lista con los libros que ha incluido el usuario a sus listas, se utiliza el ForEach para desplejar la lista
--%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <style>
            body{
            background-color:whitesmoke ;
            
            }
        </style>
    </head>
    
    
   
    <body>
         <form action="Controlador?signin=VerLibros&accion=Listar" method="POST">
        
                      <div>
                    <table class="table">
                        <thead>
                            <tr>

                                <th>Nombre Libro</th>
                                <th>Nombre Autor</th>
                                <th>Apellido Autor</th>
                                <th>Editorial</th>
                                <th>Tema</th>
                                <th>Estado de Lectura</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="li" items="${libros}" >
                                <tr>
                                    
                                    <td>${li.getNombrelibro()}</td>
                                    <td>${li.getAutor().getNombreAutor()}</td>
                                    <td>${li.getAutor().getApellidosAutor()}</td>
                                    <td>${li.getEditorial()}</td>
                                    <td>${li.getTema()}</td>
                                    <td>${li.getEstale()}</td>
                                    <td>
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                Opciones
                                            </button>
                                            <div class="dropdown-menu">
                                                <a class="dropdown-item" href="Controlador?signin=VerLibros&accion=Editar&id=${li.getId()}">Editar</a>
                                                <a class="dropdown-item" href="Controlador?signin=VerLibros&accion=Delete&id=${li.getId()}">Eliminar</a>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
     </form>                                       
                                            
                                                <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>
