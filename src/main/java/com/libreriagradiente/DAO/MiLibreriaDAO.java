/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.DAO;

import com.libreriagradiente.conexion.Conexion;
import com.libreriagradiente.modelo.EstadoLectura;
import com.libreriagradiente.modelo.tablas;
import com.mysql.cj.conf.ConnectionUrlParser.Pair;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class MiLibreriaDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;



}