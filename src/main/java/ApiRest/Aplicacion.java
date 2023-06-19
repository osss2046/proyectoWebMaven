/*
 Esta es la Aplicacion de ApiRest, por lo tanto tiene la configuracion y los registros de los recuersos que seran presentados por la api


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
