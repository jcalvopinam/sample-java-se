package com.constructores;

public class Punto {
    protected int x, y;

    Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Punto() {
        this(0, 0);
    }
}
