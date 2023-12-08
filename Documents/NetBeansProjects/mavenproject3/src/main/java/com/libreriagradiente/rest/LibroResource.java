/*

    Este es el apiRest para presentar un listado de todos los libros para el administrador, este se presenta utilizando json
 */
package com.libreriagradiente.rest;

import com.libreriagradiente.DAO.libroDAO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/libros")
public class LibroResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarTodos() {
        libroDAO libroDAO = new libroDAO();
        List libros = libroDAO.listartodo();
        return Response.ok(libros).build();
    }
}
