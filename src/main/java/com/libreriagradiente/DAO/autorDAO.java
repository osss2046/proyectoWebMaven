/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.DAO;

import com.libreriagradiente.conexion.Conexion;
import com.libreriagradiente.modelo.autor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class autorDAO {
    
        Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    
    
        public List listar(){
        String sql="select * from autor";
        List<autor>lista=new ArrayList<>();
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                autor em=new autor();
                em.setId(rs.getInt(1));
                em.setNombreAutor(rs.getString(2));
                em.setApellidosAutor(rs.getString(3));
                em.setNacionalidad(rs.getString(4));
               
                lista.add(em);
            }
        }catch(Exception e){
            
        }
        return lista;
        
    }
}
