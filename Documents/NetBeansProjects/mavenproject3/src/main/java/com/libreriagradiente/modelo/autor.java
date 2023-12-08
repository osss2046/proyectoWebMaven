/*
Este es el codigo de autor y tiene los atributos, el constructor vacio, el constructor completo y todos los getter y setter

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