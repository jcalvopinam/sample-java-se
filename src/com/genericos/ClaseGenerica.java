package com.genericos;

public class ClaseGenerica<T> {
    private T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    public void tipoClase() {
        System.out.println("El tipo de T es " + objeto.getClass().getName());
    }
}
