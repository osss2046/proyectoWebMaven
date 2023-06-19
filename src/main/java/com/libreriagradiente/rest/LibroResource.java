/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
