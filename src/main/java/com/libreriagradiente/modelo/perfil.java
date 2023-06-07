/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriagradiente.modelo;

/**
 *
 * @author Oscar
 */
public class perfil {
    int id;
    int nickname;
    String preferenciasDeLec;
    String GenerosFav;
    String descripcionU;
    usuarios usuario;

    public perfil() {
    }

    public perfil(int id, int nickname, String preferenciasDeLec, String GenerosFav, String descripcionU, usuarios usuario) {
        this.id = id;
        this.nickname = nickname;
        this.preferenciasDeLec = preferenciasDeLec;
        this.GenerosFav = GenerosFav;
        this.descripcionU = descripcionU;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNickname() {
        return nickname;
    }

    public void setNickname(int nickname) {
        this.nickname = nickname;
    }

    public String getPreferenciasDeLec() {
        return preferenciasDeLec;
    }

    public void setPreferenciasDeLec(String preferenciasDeLec) {
        this.preferenciasDeLec = preferenciasDeLec;
    }

    public String getGenerosFav() {
        return GenerosFav;
    }

    public void setGenerosFav(String GenerosFav) {
        this.GenerosFav = GenerosFav;
    }

    public String getDescripcionU() {
        return descripcionU;
    }

    public void setDescripcionU(String descripcionU) {
        this.descripcionU = descripcionU;
    }

    public usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarios usuario) {
        this.usuario = usuario;
    }

    
    
}