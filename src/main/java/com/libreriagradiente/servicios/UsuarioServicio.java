package com.libreriagradiente.servicios;

import com.libreriagradiente.DAO.usuariosDAO;

import com.libreriagradiente.modelo.usuarios;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio implements UserService {
    
    private usuariosDAO usuarioDAO;
    
    public UsuarioServicio() {
        this.usuarioDAO = new usuariosDAO();
    }
    @Override
    public usuarios verificarServicio(String email, String pass) {
        System.out.println("************entra esUsuarioServicio");
        return usuarioDAO.verificar(email, pass);
    }
    @Override 
    public usuarios registrarServicio(usuarios us) {
        System.out.println("************entra getObtenerUsuarioServicio");
        return usuarioDAO.Registrar(us);
    }
    @Override 
    public int crearprefil2Servicio(int id) {
        System.out.println("************entra actualizarUsuarioServicio");
        return usuarioDAO.crearPerfil2(id);
    }



}
