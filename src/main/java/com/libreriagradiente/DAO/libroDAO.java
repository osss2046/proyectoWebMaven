/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.DAO;

import com.libreriagradiente.conexion.Conexion;
import com.libreriagradiente.modelo.autor;
import com.libreriagradiente.modelo.libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class libroDAO {
    
    
        public String getTableName() {
        // Devuelve un valor predeterminado o lanza una excepción si este método no debería ser llamado directamente
        throw new UnsupportedOperationException();
    }
    
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;


//operaciones CRUD
    
    public List listar(){
        String sql="select * from libro";
        List<libro>lista=new ArrayList<>();
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                libro lib=new libro();
                lib.setId(rs.getInt(1));
                lib.setNombrelibro(rs.getString(2));
                lib.setEditorial(rs.getString(3));
                lib.setTema(rs.getString(4));
                lib.setIdiomaLibro(rs.getString(5));
                lib.setIdAutor(rs.getString(6));
                lista.add(lib);
            }
        }catch(Exception e){
            
        }
        return lista;
        
    }
    
    public int agregar(libro lib){
        String sql="insert into libro(nombreLibro, Editorial, tema, idiomaLibro, idAutor) value(?,?,?,?,?)";
        
        System.out.println("Sql: "+sql);
        System.out.println("nombre libro "+lib.getNombrelibro()+" "+lib.getEditorial()+" "+lib.getIdAutor()+" "+lib.getIdiomaLibro()+" "+lib.getTema());
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            
            
            ps.setString(1,lib.getNombrelibro());
            ps.setString(2,lib.getEditorial());
            ps.setString(3,lib.getTema());
            ps.setString(4,lib.getIdiomaLibro());
            ps.setString(5,lib.getIdAutor());
            ps.executeUpdate();

            
        }catch(Exception e){
            
        }
        return r;
    }
    
    public libro listarId(int id){
        libro li=new libro();
        String sql="select * from libro where id="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                li.setNombrelibro(rs.getString(2));
                li.setEditorial(rs.getString(3));
                li.setTema(rs.getString(4));
                li.setIdiomaLibro(rs.getString(5));
                li.setIdAutor(rs.getString(6));
            }
        }catch(Exception e){
            
        }
        return li;
    }
    public int actualizar(libro lib){
                String sql="update libro set nombreLibro=?, Editorial=?, tema=?, idiomaLibro=?, idAutor=? where id=?";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            
            ps.setString(1,lib.getNombrelibro());
            ps.setString(2,lib.getEditorial());
            ps.setString(3,lib.getTema());
            ps.setString(4,lib.getIdiomaLibro());
            ps.setString(5,lib.getIdAutor());
            ps.setInt(6,lib.getId());
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from libro where id="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
}

