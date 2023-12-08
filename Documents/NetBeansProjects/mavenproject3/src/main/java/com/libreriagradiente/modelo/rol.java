/*
Este es el codigo del rol y tiene los atributos, el constructor vacio, el constructor completo y todos los getter y setter

 */
package com.libreriagradiente.modelo;

/**
 *
 * @author Oscar
 */
public class rol {
    int id;
    String nombre;

    public rol() {
    }

    public rol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
