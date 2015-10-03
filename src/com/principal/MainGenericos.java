package com.principal;

import com.genericos.ClaseGenerica;

public class MainGenericos {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objInteger = new ClaseGenerica<Integer>(100);
        objInteger.tipoClase();
        
        ClaseGenerica<String> objString = new ClaseGenerica<String>("Test");
        objString.tipoClase();
    }
}
