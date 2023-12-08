/*
Este es el codigo del Estado de lectura y tiene los atributos, el constructor vacio, el constructor completo y todos los getter y setter
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
