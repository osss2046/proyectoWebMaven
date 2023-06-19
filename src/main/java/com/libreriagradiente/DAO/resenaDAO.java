/*
Este codigo corresponde al DAO de Reseña por lo tanto tiene varios metodos que conectan la base de datos con controlador, estos metodos se describiran uno a uno

 */
package com.libreriagradiente.DAO;

import com.libreriagradiente.conexion.Conexion;
import com.libreriagradiente.modelo.autor;
import com.libreriagradiente.modelo.coleccion;
import com.libreriagradiente.modelo.libro;
import com.libreriagradiente.modelo.perfil;
import com.libreriagradiente.modelo.resena;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class resenaDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    int idc;

//operaciones CRUD
    //obtener el id de la coleccion para relacionarlo con la reseña
    public int OIdColec(int idL, int idP) {
        coleccion col = new coleccion();
        String sql = "select id from coleccion where idLibro = '" + idL + "' AND idPerfil = " + idP;
        System.out.println(sql);
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                col.setId(rs.getInt(1));
            }
        } catch (Exception e) {

        }
        return col.getId();
    }
// Metodo que permite listar las reseñas, esto es para luego poder desplegarlas
    public List listaRes() {
        String sql = "select r.id, r.fechaAgregada, r.calificacionLibro, r.Resena, l.nombreLibro, a.Apellidos, p.nickname from resena r, libro l, autor a, "
                + "perfil p, coleccion c where r.idColeccion=c.id and c.idPerfil=p.id and a.idLibro=l.id and l.id=c.idLibro";
        List<resena> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                resena res = new resena();
                res.setId(rs.getInt(1));
                res.setFechaAgregada(rs.getString(2));
                res.setCalificacionLibro(rs.getInt(3));
                res.setResena(rs.getString(4));
                res.setLib(new libro());
                res.getLib().setNombrelibro(rs.getString(5));
                res.setAu(new autor());
                res.getAu().setApellidosAutor(rs.getString(6));
                res.setPerfil(new perfil());
                res.getPerfil().setNickname(rs.getString(7));
                
                lista.add(res);
                
            }
        } catch (Exception e) {

        }

        return lista;

    }
// Metodo que permite agregar una nueva reseña, por lo tanto se inserta en la BBDD
    public void AgregarR(resena res) {
        String sql = "insert into resena(Resena, calificacionLibro, idColeccion) values(?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, res.getResena());
            ps.setInt(2, res.getCalificacionLibro());
            ps.setInt(3, res.getIdColeccion());
            ps.executeUpdate();

        } catch (Exception e) {

        }

    }

}


