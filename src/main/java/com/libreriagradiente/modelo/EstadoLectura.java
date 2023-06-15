/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.modelo;

/**
 *
 * @author Oscar
 */
public class EstadoLectura {
    int Estado;
    int CantidadEnEstado;

    public EstadoLectura() {
    }

    public EstadoLectura(int Estado, int CantidadEnEstado) {
        this.Estado = Estado;
        this.CantidadEnEstado = CantidadEnEstado;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public int getCantidadEnEstado() {
        return CantidadEnEstado;
    }

    public void setCantidadEnEstado(int CantidadEnEstado) {
        this.CantidadEnEstado = CantidadEnEstado;
    }

    @Override
    public String toString() {
        return "EstadoLectura{" + "Estado=" + Estado + ", CantidadEnEstado=" + CantidadEnEstado + '}';
    }
    
    
}
