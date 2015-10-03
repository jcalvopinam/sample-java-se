package com.principal;

import com.herencia.Dos;
import com.herencia.Tres;
import com.herencia.Uno;

public class MainHerencia {
    public static void main(String[] args) {
        Uno[] lista = new Uno[2];
        lista[0] = new Dos();
        lista[1] = new Tres();

        for (int i = 0; i < lista.length; i++) {
            lista[i].frase();
        }
    }
}
