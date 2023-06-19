/*
Este codigo corresponde al DAO de usuarios por lo tanto tiene varios metodos que conectan la base de datos con controlador, estos metodos se describiran uno a uno

 */
package com.libreriagradiente.DAO;

import com.libreriagradiente.Log.CrearLog;
import com.libreriagradiente.conexion.Conexion;
import com.libreriagradiente.modelo.perfil;
import com.libreriagradiente.modelo.rol;
import com.libreriagradiente.modelo.usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Oscar
 */
public class usuariosDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int i;




// Este metodo permite verificar si el usuario ingresado esta en la base de datos
    public usuarios verificar(String email, String pass) {
        usuarios us = new usuarios();
        String sql = "SELECT U.id, R.nombre, U.nombreUsuario FROM usuarios U INNER JOIN rol R ON U.idRol = R.id WHERE U.uemail = '" + email + "' "
                + "AND U.uppassword = '" + pass + "'";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                us.setId(rs.getInt("id"));
                us.setEmail(email);
                us.setRol(new rol());
                us.getRol().setNombre(rs.getString("nombre"));
                us.setNombreU(rs.getString("nombreUsuario"));
                us.setPasswordU(pass);
            }
        } catch (Exception ex) {
            System.out.println("Error de conexión Log - obtenerUsuario: " + ex.getMessage()); //Visualización del error por consola
            CrearLog.errorLog("Error de conexión Log - obtenerUsuario: " + ex.getMessage()); //Visualización del error a través de archivo Log

        }

        return us;
    }
// Este metodo permite registrar un nuevo usuario en la base de datos
    public usuarios Registrar(usuarios us) {

        String sql = "insert into usuarios(nombreUsuario,uppassword,uemail,idRol) values(?,?,?,?)";

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getNombreU());
            ps.setString(2, us.getPasswordU());
            ps.setString(3, us.getEmail());
            ps.setInt(4, 2);
            ps.executeUpdate();

        } catch (Exception e) {

        }

        return us;
    }


// Este metodo permite crear un perfil para cada usuario registrado en la base de datos
    public int crearPerfil2(int id) {
        String sql2 = "insert into perfil(idUsuario) values(?)";

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, id);
            i=id;
            ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("Error de conexión Log - obtenerUsuario: " + ex.getMessage()); //Visualización del error por consola
            CrearLog.errorLog("Error de conexión Log - obtenerUsuario: " + ex.getMessage()); //Visualización del error a través de archivo Log
        }
        return i;
    }
    


}
