/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

//
//    public List listar(){
//        String sql="select * from libro";
//        List<libro>lista=new ArrayList<>();
//        try{
//            con=cn.Conexion();
//            ps=con.prepareStatement(sql);
//            rs=ps.executeQuery();
//            while(rs.next()){
//                libro lib=new libro();
//                lib.setId(rs.getInt(1));
//                lib.setNombrelibro(rs.getString(2));
//                lib.setEditorial(rs.getString(3));
//                lib.setTema(rs.getString(4));
//                lib.setIdiomaLibro(rs.getString(5));
//         //       lib.setIdAutor(rs.getString(6));
//                lista.add(lib);
//            }
//        }catch(Exception e){
//            
//        }
//        return lista;
//        
//    }
//    
//    public int agregar(libro lib){
//        String sql="insert into libro(nombreLibro, Editorial, tema, idiomaLibro, idAutor) value(?,?,?,?,?)";
//        
//        System.out.println("Sql: "+sql);
//        System.out.println("nombre libro "+lib.getNombrelibro()+" "+lib.getEditorial()+" "+lib.getAutor()+" "+lib.getIdiomaLibro()+" "+lib.getTema());
//        try{
//            con=cn.Conexion();
//            ps=con.prepareStatement(sql);
//            
//            
//            ps.setString(1,lib.getNombrelibro());
//            ps.setString(2,lib.getEditorial());
//            ps.setString(3,lib.getTema());
//            ps.setString(4,lib.getIdiomaLibro());
//     //       ps.setString(5,lib.getAutor());
//            ps.executeUpdate();
//
//            
//        }catch(Exception e){
//            
//        }
//        return r;
//    }
//    
//    public libro listarId(int id){
//        libro li=new libro();
//        String sql="select * from libro where id="+id;
//        try{
//            con=cn.Conexion();
//            ps=con.prepareStatement(sql);
//            rs=ps.executeQuery();
//            while(rs.next()){
//                li.setNombrelibro(rs.getString(2));
//                li.setEditorial(rs.getString(3));
//                li.setTema(rs.getString(4));
//                li.setIdiomaLibro(rs.getString(5));
//       //         li.setIdAutor(rs.getString(6));
//            }
//        }catch(Exception e){
//            
//        }
//        return li;
//    }
//    public int actualizar(libro lib){
//                String sql="update libro set nombreLibro=?, Editorial=?, tema=?, idiomaLibro=?, idAutor=? where id=?";
//        try{
//            con=cn.Conexion();
//            ps=con.prepareStatement(sql);
//            
//            ps.setString(1,lib.getNombrelibro());
//            ps.setString(2,lib.getEditorial());
//            ps.setString(3,lib.getTema());
//            ps.setString(4,lib.getIdiomaLibro());
//            ps.setInt(6,lib.getId());
//            ps.executeUpdate();
//        }catch(Exception e){
//            
//        }
//        return r;
//    }
//    public void delete(int id){
//        String sql="delete from libro where id="+id;
//        try{
//            con=cn.Conexion();
//            ps=con.prepareStatement(sql);
//            ps.executeUpdate();
//        }catch(Exception e){
//            
//        }
//    }
//
