/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.modelo;

/**
 *
 * @author Oscar
 */
public class libro {
    int id;
    String nombrelibro;
    String Editorial;
    String tema;
    String idiomaLibro;
    int numModulo;
    String idAutor;

    public libro() {
    }

    public libro(int id, String nombrelibro, String Editorial, String tema, String idiomaLibro, int numModulo, String idAutor) {
        this.id = id;
        this.nombrelibro = nombrelibro;
        this.Editorial = Editorial;
        this.tema = tema;
        this.idiomaLibro = idiomaLibro;
        this.numModulo = numModulo;
        this.idAutor = idAutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrelibro() {
        return nombrelibro;
    }

    public void setNombrelibro(String nombrelibro) {
        this.nombrelibro = nombrelibro;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getIdiomaLibro() {
        return idiomaLibro;
    }

    public void setIdiomaLibro(String idiomaLibro) {
        this.idiomaLibro = idiomaLibro;
    }

    public int getNumModulo() {
        return numModulo;
    }

    public void setNumModulo(int numModulo) {
        this.numModulo = numModulo;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    
}
