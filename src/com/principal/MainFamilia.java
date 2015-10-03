package com.principal;

import com.herencia.Hija;
import com.herencia.Nieta;
import com.herencia.Padre;

public class MainFamilia {

    public static void main(String[] args) {
        Hija h = new Hija(4);
        h = f(h);
        System.out.println(h.aa());
    }

    private static Nieta f (Padre h){
        Nieta n = new Nieta(h.aa());
        return n;
    }
}
