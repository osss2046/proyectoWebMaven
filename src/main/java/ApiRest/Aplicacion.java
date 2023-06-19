/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApiRest;

import com.libreriagradiente.rest.LibroResource;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class Aplicacion extends ResourceConfig {
    public Aplicacion() {
        // Asegúrate de que la ubicación de las clases Recurso y LibroResource sean correctas.
        register(Recurso.class);
        register(LibroResource.class);
    }
}
