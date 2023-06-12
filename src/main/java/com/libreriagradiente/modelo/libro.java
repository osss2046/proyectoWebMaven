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
    int estadoLectura;
    String estale;
    autor autor;
    

    public libro() {
 
    }

    public libro(int id, String nombrelibro, String Editorial, String tema, String idiomaLibro, int estadoLectura, String estale, autor autor) {
        this.id = id;
        this.nombrelibro = nombrelibro;
        this.Editorial = Editorial;
        this.tema = tema;
        this.idiomaLibro = idiomaLibro;
        this.estadoLectura = estadoLectura;
        this.estale = estale;
        this.autor = autor;
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

    public int getEstadoLectura() {
        return estadoLectura;
    }

    public void setEstadoLectura(int estadoLectura) {
        this.estadoLectura = estadoLectura;
    }

    public String getEstale() {
        return estale;
    }

    public void setEstale(String estale) {
        this.estale = estale;
    }

    public autor getAutor() {
        return autor;
    }

    public void setAutor(autor autor) {
        this.autor = autor;
    }

}