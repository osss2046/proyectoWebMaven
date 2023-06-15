<%-- 
    Document   : ListarUsuarios
    Created on : 15-jun-2023, 13:39:46
    Author     : Oscar
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
         <form action="Controlador?signin=ListarUsuarios&accion=Listar" method="POST">
        
                      <div>
                    <table class="table">
                        <thead>
                            <tr>

                                <th>id</th>
                                <th>nombre Usuario</th>
                                <th>Email</th>
                                <th>Nombre Rol</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="us" items="${usuarios}" >
                                <tr>
                                    
                                    <td>${us.getId()}</td>
                                    <td>${us.getNombreU()}</td>
                                    <td>${us.getEmail()}</td>
                                    <td>${us.getRol().getNombre()}</td>

                                    <td>
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                Opciones
                                            </button>
                                            <div class="dropdown-menu">
                                                <a class="dropdown-item" href="Controlador?signin=ListarUsuarios&accion=Editar&id=${us.getId()}">Hacer Administrador</a>
                                                <a class="dropdown-item" href="Controlador?signin=ListarUsuarios&accion=Eliminar&id=${us.getId()}">Eliminar</a>
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
