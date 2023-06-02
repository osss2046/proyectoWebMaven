/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.modelo;

/**
 *
 * @author Oscar
 */
public class resena {
    int id;
    String reseña;
    int idLibro;
    String fechaAgregada;
    int calificacionLibro;
    int numModulo;

    public resena() {
    }

    public resena(int id, String reseña, int idLibro, String fechaAgregada, int calificacionLibro, int numModulo) {
        this.id = id;
        this.reseña = reseña;
        this.idLibro = idLibro;
        this.fechaAgregada = fechaAgregada;
        this.calificacionLibro = calificacionLibro;
        this.numModulo = numModulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
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

    public int getNumModulo() {
        return numModulo;
    }

    public void setNumModulo(int numModulo) {
        this.numModulo = numModulo;
    }
    
    
}
