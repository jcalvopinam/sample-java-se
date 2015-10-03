package com.principal;

import com.constructores.ClaseA;
import com.constructores.ClaseB;
import com.constructores.ClaseC;

public class MainConstructores {
    public static void main(String[] args) {
        ClaseC c = new ClaseC();
        ClaseA a1 = c;
        ClaseA a2 = new ClaseB();
        ClaseB b1 = c;
        a1 = b1;
        // jvergara@academia-atica.com
    }
}
