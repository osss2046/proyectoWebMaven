/*
Este es el codigo de perfil y tiene los atributos, el constructor vacio, el constructor completo y todos los getter y setter

 */
package com.libreriagradiente.modelo;

import java.io.InputStream;

/**
 *
 * @author Oscar
 */
public class perfil {
    int id;
    String nickname;
    String preferenciasDeLec;
    String GenerosFav;
    String descripcionU;
    usuarios usuario;
    InputStream foto;
    int meta;

    public perfil() {
    }

    public perfil(int id, String nickname, String preferenciasDeLec, String GenerosFav, String descripcionU, usuarios usuario, InputStream foto, int meta) {
        this.id = id;
        this.nickname = nickname;
        this.preferenciasDeLec = preferenciasDeLec;
        this.GenerosFav = GenerosFav;
        this.descripcionU = descripcionU;
        this.usuario = usuario;
        this.foto = foto;
        this.meta = meta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
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

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }



    
    
    
}