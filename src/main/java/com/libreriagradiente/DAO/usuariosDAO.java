/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.DAO;

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

//    public usuarios validar(String email, String pass){
//        usuarios us = new usuarios();
//        String sql="select * from usuarios where uemail=? and uppassword=?";
//        try{
//            con=cn.Conexion();
//            ps=con.prepareStatement(sql);
//            ps.setString(1,email);
//            ps.setString(2, pass);
//            rs=ps.executeQuery();
//            while (rs.next()) {
//                us.setEmail(rs.getString("uemail"));
//                us.setPasswordU(rs.getString("uppassword"));
//                us.setNombreU(rs.getString("nombreUsuario"));
//            }
//        }catch(Exception e){}
//        return us;
//    }
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
        } catch (Exception e) {

        }

        return us;
    }

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

    public int crearPerfil(usuarios us1) {

        String sql1 = "select id from usuarios where uemail = '" + us1.getEmail() + "' and uppassword = '" + us1.getPasswordU() + "'";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql1);
            rs = ps.executeQuery();
            while (rs.next()) {
                us1.setId(rs.getInt("id"));

            }
        } catch (Exception e) {

        }
        return us1.getId();
    }

    public void crearPerfil2(int id){
        String sql2="insert into perfil(idUsuario) values(?)";
        
          try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {

        }

        
    }

}
