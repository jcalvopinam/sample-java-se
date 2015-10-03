package com.constructores;

public class Punto3D extends Punto {

    protected int z;

    Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    Punto3D() {
        this(0, 0, 0);
    }
}
