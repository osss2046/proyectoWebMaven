/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.modelo;

/**
 *
 * @author Oscar
 */
public class rol_operacion {
    int id;
    int idRol;
    int idOperacion;

    public rol_operacion() {
    }

    public rol_operacion(int id, int idRol, int idOperacion) {
        this.id = id;
        this.idRol = idRol;
        this.idOperacion = idOperacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }
    
    
}
