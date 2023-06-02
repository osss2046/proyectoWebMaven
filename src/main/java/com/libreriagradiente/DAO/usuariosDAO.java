/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.DAO;

import com.libreriagradiente.conexion.Conexion;
import com.libreriagradiente.modelo.usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Oscar
 */
public class usuariosDAO {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public usuarios validar(String email, String pass){
        usuarios us = new usuarios();
        String sql="select * from usuarios where uemail=? and uppassword=?";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1,email);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            while (rs.next()) {
                us.setEmail(rs.getString("uemail"));
                us.setPasswordU(rs.getString("uppassword"));
                us.setNombreU(rs.getString("nombreUsuario"));
            }
        }catch(Exception e){}
        return us;
    } 

    
}
