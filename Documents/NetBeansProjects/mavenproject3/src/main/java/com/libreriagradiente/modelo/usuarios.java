/*
Este es el codigo del usuario y tiene los atributos, el constructor vacio, el constructor completo y todos los getter y setter

 */
package com.libreriagradiente.modelo;

/**
 *
 * @author Oscar
 */
public class usuarios {
    int id;
    String nombreU;
    String passwordU;
    String email;
    rol rol;
    

    public usuarios() {
    }

    public usuarios(int id, String nombreU, String passwordU, String email, rol rol) {
        this.id = id;
        this.nombreU = nombreU;
        this.passwordU = passwordU;
        this.email = email;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getPasswordU() {
        return passwordU;
    }

    public void setPasswordU(String passwordU) {
        this.passwordU = passwordU;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public rol getRol() {
        return rol;
    }

    public void setRol(rol rol) {
        this.rol = rol;
    }
    
    
    
}
