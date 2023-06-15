/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.modelo;

/**
 *
 * @author Oscar
 */
public class autor {
    int id;
    String nombreAutor;
    String ApellidosAutor;
    String Nacionalidad;

    public autor() {
    }

    public autor(int id, String nombreAutor, String ApellidosAutor, String Nacionalidad) {
        this.id = id;
        this.nombreAutor = nombreAutor;
        this.ApellidosAutor = ApellidosAutor;
        this.Nacionalidad = Nacionalidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidosAutor() {
        return ApellidosAutor;
    }

    public void setApellidosAutor(String ApellidosAutor) {
        this.ApellidosAutor = ApellidosAutor;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

}