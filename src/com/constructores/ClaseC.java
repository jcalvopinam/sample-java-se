package com.constructores;

public class ClaseC extends ClaseB {
    protected String var5;
    private String var6;

    public String getVar5() {
        return var5;
    }

    public void setVar5(String var5) {
        this.var5 = var5;
    }

    public String getVar6() {
        return var6;
    }

    public void setVar6(String var6) {
        this.var6 = var6;
    }

    public ClaseC() {
        System.out.println("Constructor clase C");
    }
}
