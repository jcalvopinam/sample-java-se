package com.beans;

public class Goma extends Golosinas {

    private String tamanio;

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Goma(String marca, String tamanio) {
        super(marca);
        this.tamanio = tamanio;
    }

}
