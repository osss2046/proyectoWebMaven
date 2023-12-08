/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.DAO;

/**
 *
 * @author Oscar
 */
public class libroDeseoDAO extends libroDAO {
    // Asumiendo que la tabla de la base de datos es "librosDeseo"
    @Override
    public String getTableName() {
        return "librosDeseo";
    }
}
