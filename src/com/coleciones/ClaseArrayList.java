package com.coleciones;

import java.util.ArrayList;
import java.util.Arrays;

public class ClaseArrayList {
    ArrayList<String> lista;

    public ArrayList<String> insertarArreglo(String[] elementos) {
        lista = (ArrayList<String>) Arrays.asList(elementos);
        return lista;
    }

    public ArrayList<String> insertarElemento(int index, String element) {
        lista.add(index, element);
        return lista;
    }

    public ArrayList<String> insertarElemento(String element) {
        lista.add(element);
        return lista;
    }

    public ArrayList<String> eliminarElemento(int index) {
        lista.remove(index);
        return lista;
    }

    public ArrayList<String> eliminarElemento(String elemento) {
        lista.remove(elemento);
        return lista;
    }

    public ArrayList<String> modificarElemento(int index, String element) {
        lista.set(index, element);
        return lista;
    }

    public String buscarElemento(int index) {
        return lista.get(index);
    }
}
