/*
En este recurso de la api solo despliega un mensaje por pantalla en html, esto es una prueba inicial de la apiRest
 */
package ApiRest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hola")
public class Recurso {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response decirHola() {
        String mensaje = "<html><body><h2>¡Hola mundo!</h2></body></html>";
        return Response.ok(mensaje).build();
    }
}
