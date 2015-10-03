package com.genericos;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T> {

    private int capacidad;
    private int numeroElementos;
    private ArrayList<T> lista = new ArrayList<T>();

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroElementos() {
        numeroElementos = lista.size();
        return numeroElementos;
    }


    public Bolsa(int capacidad) {
        this.capacidad = capacidad;
    }

    public void add(T objeto){
        if (numeroElementos <= capacidad){
            lista.add(objeto);
        }else{
            throw new RuntimeException("Lista llena");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }

}
