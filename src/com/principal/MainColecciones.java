package com.principal;

import com.coleciones.ClaseArrayList;

public class MainColecciones {

    public static void main(String[] args) {
        String[] nombres = { "Andrea", "Carolina", "Annabel", "Cristina", "Veronica", "Patricia" };

        ClaseArrayList c1 = new ClaseArrayList();
        c1.insertarArreglo(nombres);

        System.out.println("Nombre: " + c1.buscarElemento(0));

        System.out.println(c1.eliminarElemento(4));
        System.out.println(c1.eliminarElemento("Annabel"));
        System.out.println(c1.insertarElemento("Lupe"));
        System.out.println(c1.insertarElemento(2, "Marcela"));
        System.out.println(c1.modificarElemento(4, "Avril"));

    }
}
