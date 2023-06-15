/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.DAO;

import com.libreriagradiente.conexion.Conexion;
import com.libreriagradiente.modelo.perfil;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Oscar
 */
public class perfilDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public int actualizar(int id, perfil p) {

        String sql = "update perfil set nickname=?, Preferencia_de_Lecturas=?,"
                + " Generos_favoritos=?, DescripcionUsuario=?, meta=? where idUsuario=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, p.getNickname());
            ps.setString(2, p.getPreferenciasDeLec());
            ps.setString(3, p.getGenerosFav());
            ps.setString(4, p.getDescripcionU());
            ps.setInt(5, p.getMeta());

            ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }

    public perfil obtenerDeBD(int id, perfil p) {
        String sql = "select * from perfil where idUsuario=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNickname(rs.getString(3));
                p.setPreferenciasDeLec(rs.getString(4));
                p.setGenerosFav(rs.getString(5));
                p.setDescripcionU(rs.getString(6));
                p.setMeta(rs.getInt(7));
            }

        } catch (Exception e) {

        }

        return p;
    }

}
