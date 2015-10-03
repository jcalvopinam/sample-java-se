package com.constructores;

public class ClaseB extends ClaseA {
    protected String var3;
    private String var4;

    public String getVar3() {
        return var3;
    }

    public void setVar3(String var3) {
        this.var3 = var3;
    }

    public String getVar4() {
        return var4;
    }

    public void setVar4(String var4) {
        this.var4 = var4;
    }

    public ClaseB() {
        System.out.println("Constructor clase B");
    }
}
