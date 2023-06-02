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
    int idUsuario;

    public perfil() {
    }

    public perfil(int id, int nickname, String preferenciasDeLec, String GenerosFav, String descripcionU, int idUsuario) {
        this.id = id;
        this.nickname = nickname;
        this.preferenciasDeLec = preferenciasDeLec;
        this.GenerosFav = GenerosFav;
        this.descripcionU = descripcionU;
        this.idUsuario = idUsuario;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
