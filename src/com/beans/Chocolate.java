package com.beans;

public class Chocolate extends Golosinas {

    private String relleno;

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public Chocolate(String marca, String relleno) {
        super(marca);
        this.relleno = relleno;
    }

}
