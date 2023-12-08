/*
Este es el codigo de coleccion y tiene los atributos, el constructor vacio, el constructor completo y todos los getter y setter

 */
package com.libreriagradiente.modelo;

/**
 *
 * @author Oscar
 */
public class coleccion {
    int id;
    int idlibro;
    int idPerfil;

    public coleccion() {
    }

    public coleccion(int id, int idlibro, int idPerfil) {
        this.id = id;
        this.idlibro = idlibro;
        this.idPerfil = idPerfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }


}
