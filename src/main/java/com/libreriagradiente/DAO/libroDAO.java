/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.DAO;

import com.libreriagradiente.conexion.Conexion;
import com.libreriagradiente.modelo.autor;
import com.libreriagradiente.modelo.coleccion;
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
    public List listar(int idPerfil) {
        String sql = "select * from libro l left join coleccion c on l.id=c.idLibro where idPerfil=" + idPerfil;
        List<libro> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                libro lib = new libro();
                lib.setId(rs.getInt(1));
                lib.setNombrelibro(rs.getString(2));
                lib.setEditorial(rs.getString(3));
                lib.setTema(rs.getString(4));
                lib.setIdiomaLibro(rs.getString(5));
                lib.setEstadoLectura(rs.getInt(6));

                if (lib.getEstadoLectura() == 1) {
                    lib.setEstale("Lista de Deseo");
                }
                if (lib.getEstadoLectura() == 2) {
                    lib.setEstale("Leyendo");

                }
                if (lib.getEstadoLectura() == 3) {
                    lib.setEstale("Leido");

                }

                lista.add(lib);
            }
        } catch (Exception e) {

        }
        return lista;

    }

    public List listarNue(int idPerfil) {
        String sql = "select l.id, l.nombreLibro, a.nombresAutor, a.Apellidos, l.Editorial,l.tema,.l.EstadoLectura from libro l, autor a, coleccion c where"
                + " ( l.id=a.idLibro) and (c.idPerfil='" + idPerfil + "') and (l.id=c.idLibro) order by l.nombreLibro asc";
        List<libro> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                libro lib = new libro();

                lib.setId(rs.getInt(1));
                lib.setNombrelibro(rs.getString(2));
                lib.setAutor(new autor());
                lib.getAutor().setNombreAutor(rs.getString(3));
                lib.getAutor().setApellidosAutor(rs.getString(4));
                lib.setEditorial(rs.getString(5));
                lib.setTema(rs.getString(6));
                lib.setEstadoLectura(rs.getInt(7));

                if (lib.getEstadoLectura() == 1) {
                    lib.setEstale("Lista de Deseo");
                }
                if (lib.getEstadoLectura() == 2) {
                    lib.setEstale("Leyendo");

                }
                if (lib.getEstadoLectura() == 3) {
                    lib.setEstale("Leido");

                }

                lista.add(lib);
            }
        } catch (Exception e) {

        }
        return lista;

    }

    public List listarAu() {
        String sql = "select * from autor order by nombreLibro";
        List<autor> lista2 = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                autor au = new autor();
                au.setId(rs.getInt(1));
                au.setNombreAutor(rs.getString(2));
                au.setApellidosAutor(rs.getString(3));
                au.setNacionalidad(rs.getString(4));

                lista2.add(au);
            }
        } catch (Exception e) {

        }
        return lista2;

    }

    public String Existe(libro lib) {
        String sql = "SELECT nombreLibro from libro where nombreLibro= '"+lib.getNombrelibro()+"' " ;
        String para = null;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            para = rs.getString(1);
            }
        } catch (Exception e) {

        }
        System.out.println("prueba33 :"+para);
        System.out.println(lib.getNombrelibro());
        System.out.println(sql);
        return para;
    }

    public libro agregar(libro lib) {

        String sql = "insert into libro(nombreLibro, Editorial, tema, idiomaLibro, EstadoLectura) value(?,?,?,?,?)";

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, lib.getNombrelibro());
            ps.setString(2, lib.getEditorial());
            ps.setString(3, lib.getTema());
            ps.setString(4, lib.getIdiomaLibro());
            ps.setInt(5, lib.getEstadoLectura());
            ps.executeUpdate();

        } catch (Exception e) {

        }
        return lib;
    }

    public int idLibro(libro lib) {

        String sql = "select id FROM libro where nombreLibro = '" + lib.getNombrelibro() + "' "
                + "AND Editorial = '" + lib.getEditorial() + "' AND idiomaLibro = '" + lib.getIdiomaLibro() + "'";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lib.setId(rs.getInt("id"));
            }

        } catch (Exception e) {

        }
        return lib.getId();
    }

    public autor agregarAu(int id, autor au) {

        String sql = "insert into autor(nombresAutor, Apellidos, Nacionalidad, idLibro) value(?,?,?,?)";

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, au.getNombreAutor());
            ps.setString(2, au.getApellidosAutor());
            ps.setString(3, au.getNacionalidad());
            ps.setInt(4, id);

            ps.executeUpdate();

            au.setId(id);

        } catch (Exception e) {

        }
        return au;
    }

    public coleccion CrearColeccion(int idLibro, int idPerfil) {
        coleccion col = new coleccion();
        String sql = "insert into coleccion(idLibro, idPerfil) values(?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idLibro);
            ps.setInt(2, idPerfil);
            ps.executeUpdate();

            col.setIdPerfil(idPerfil);
            col.setIdlibro(idLibro);

        } catch (Exception e) {

        }

        return col;
    }

    public libro listarId(int id) {
        libro li = new libro();
        String sql = "select * from libro where id=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                li.setNombrelibro(rs.getString(2));
                li.setEditorial(rs.getString(3));
                li.setTema(rs.getString(4));
                li.setIdiomaLibro(rs.getString(5));

            }
        } catch (Exception e) {

        }
        return li;
    }

    public autor listarIdAu(int id) {
        autor au = new autor();
        String sql = "select * from autor where idLibro=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                au.setNombreAutor(rs.getString(2));
                au.setApellidosAutor(rs.getString(3));
                au.setNacionalidad(rs.getString(4));

            }
        } catch (Exception e) {

        }
        return au;
    }

    public libro actualizar(libro lib) {
        String sql = "update libro set nombreLibro=?, Editorial=?, tema=?, idiomaLibro=?, EstadoLectura=? where id=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, lib.getNombrelibro());
            ps.setString(2, lib.getEditorial());
            ps.setString(3, lib.getTema());
            ps.setString(4, lib.getIdiomaLibro());
            ps.setInt(5, lib.getEstadoLectura());
            ps.setInt(6, lib.getId());

            ps.executeUpdate();
        } catch (Exception e) {

        }
        return lib;
    }

    public int actualizarAu(int id, autor au) {
        String sql = "update autor set nombresAutor=?, Apellidos=?, Nacionalidad=? where idLibro=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, au.getNombreAutor());
            ps.setString(2, au.getApellidosAutor());
            ps.setString(3, au.getNacionalidad());

            ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }

    public void DeleteAuConIdLi(int id) {
        String sql = "delete from autor where idLibro=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void delete(int id) {
        String sql = "delete from libro where id=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }
    public void DeleteCol(int id){
        String sql="delete from coleccion where id="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        }catch(Exception e){
            
        }
    }
    
    
        public List listartodo() {
        String sql = "select l.id, l.nombreLibro, a.nombresAutor, a.Apellidos, l.Editorial,l.tema,.l.EstadoLectura from libro l, autor a, coleccion c where"
                + " ( l.id=a.idLibro) and (l.id=c.idLibro) order by l.nombreLibro asc";
        List<libro> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                libro lib = new libro();

                lib.setId(rs.getInt(1));
                lib.setNombrelibro(rs.getString(2));
                lib.setAutor(new autor());
                lib.getAutor().setNombreAutor(rs.getString(3));
                lib.getAutor().setApellidosAutor(rs.getString(4));
                lib.setEditorial(rs.getString(5));
                lib.setTema(rs.getString(6));
                lib.setEstadoLectura(rs.getInt(7));

                if (lib.getEstadoLectura() == 1) {
                    lib.setEstale("Lista de Deseo");
                }
                if (lib.getEstadoLectura() == 2) {
                    lib.setEstale("Leyendo");

                }
                if (lib.getEstadoLectura() == 3) {
                    lib.setEstale("Leido");

                }

                lista.add(lib);
            }
        } catch (Exception e) {

        }
        return lista;

    }

}
