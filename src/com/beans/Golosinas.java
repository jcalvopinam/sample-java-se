package com.beans;

public abstract class Golosinas {

    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Golosinas(String marca) {
        this.marca = marca;
    }

}
