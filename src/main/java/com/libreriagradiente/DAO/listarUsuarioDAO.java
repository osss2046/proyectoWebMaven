/*
Este codigo corresponde al DAO de listar Usuarios por lo tanto tiene varios metodos que conectan la base de datos con controlador, estos metodos se describiran uno a uno

 */
package com.libreriagradiente.DAO;

import com.libreriagradiente.conexion.Conexion;
import com.libreriagradiente.modelo.libro;
import com.libreriagradiente.modelo.rol;
import com.libreriagradiente.modelo.usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class listarUsuarioDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    //CRUD
    // retorna una lista con los usuarios y los atributos id, nombreUsuario, uemail, idRol
    public List listarUs() {
        String sql = "select id, nombreUsuario, uemail, idRol from usuarios";
        List<usuarios> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuarios us = new usuarios();

                us.setId(rs.getInt(1));
                us.setNombreU(rs.getString(2));

                us.setEmail(rs.getString(3));
                us.setRol(new rol());
                us.getRol().setId(rs.getInt(4));
                if (us.getRol().getId() == 1) {
                    us.getRol().setNombre("Administrador");
                }
                if (us.getRol().getId() == 2) {
                    us.getRol().setNombre("cliente");
                }

                lista.add(us);
            }
        } catch (Exception e) {

        }
        return lista;

    }
// Actualiza los usuarios. Esto es solo accesible por el administrador y la actualizacion es para cambiar el rol del usario elegido por el admin para que este pueda ser admin.
 
    public void actualizarU(int id) {
        String sql = "update usuarios set idRol=1 where id="+id;
        usuarios us = new usuarios();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
            System.out.println(sql);
        } catch (Exception e) {

        }
    }
    // Este metodo puede eliminar un usuario y es accesible solo por el admin.
        public void eliminarU(int id) {
        String sql = "delete from usuarios where idLibro=" + id;
                try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
            System.out.println(sql);
        } catch (Exception e) {

        }
    }

}
