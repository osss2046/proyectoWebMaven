/*
Este es el codigo de la reseña y tiene los atributos, el constructor vacio, el constructor completo y todos los getter y setter

 */
package com.libreriagradiente.modelo;

/**
 *
 * @author Oscar
 */
public class resena {
    int id;
    String resena;
    String fechaAgregada;
    int calificacionLibro;
    int idColeccion;
    autor au;
    libro lib;
    perfil perfil;
    
    public resena() {
    }

    public resena(int id, String resena, String fechaAgregada, int calificacionLibro, int idColeccion, autor au, libro lib, perfil perfil) {
        this.id = id;
        this.resena = resena;
        this.fechaAgregada = fechaAgregada;
        this.calificacionLibro = calificacionLibro;
        this.idColeccion = idColeccion;
        this.au = au;
        this.lib = lib;
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public String getFechaAgregada() {
        return fechaAgregada;
    }

    public void setFechaAgregada(String fechaAgregada) {
        this.fechaAgregada = fechaAgregada;
    }

    public int getCalificacionLibro() {
        return calificacionLibro;
    }

    public void setCalificacionLibro(int calificacionLibro) {
        this.calificacionLibro = calificacionLibro;
    }

    public int getIdColeccion() {
        return idColeccion;
    }

    public void setIdColeccion(int idColeccion) {
        this.idColeccion = idColeccion;
    }

    public autor getAu() {
        return au;
    }

    public void setAu(autor au) {
        this.au = au;
    }

    public libro getLib() {
        return lib;
    }

    public void setLib(libro lib) {
        this.lib = lib;
    }

    public perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(perfil perfil) {
        this.perfil = perfil;
    }

    

    
}