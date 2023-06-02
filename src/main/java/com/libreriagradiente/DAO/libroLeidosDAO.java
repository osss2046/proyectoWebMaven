/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.DAO;

/**
 *
 * @author Oscar
 */
public class libroLeidosDAO extends libroDAO {
    // Asumiendo que la tabla de la base de datos es "librosLeidos"
    @Override
    public String getTableName() {
        return "librosLeidos";
    }
}