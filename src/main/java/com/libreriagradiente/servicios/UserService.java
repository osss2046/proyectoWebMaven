
// Esta es la capa de servicios

package com.libreriagradiente.servicios;

import java.util.HashMap;
import java.util.List;
import com.libreriagradiente.modelo.usuarios;

public interface UserService {
    
    usuarios verificarServicio(String email, String pass);
    

    
    usuarios registrarServicio(usuarios us);
    
    int crearprefil2Servicio(int id);

}
