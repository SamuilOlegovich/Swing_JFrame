package com.test;

public class Gasket {
    private static SimpleGUE simpleGUE;

    public static SimpleGUE getSimpleGUE() {
        return simpleGUE;
    }

    public static void setSimpleGUE(SimpleGUE simpleGUE) {
        Gasket.simpleGUE = simpleGUE;
    }
}
