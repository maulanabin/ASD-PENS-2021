package com.maulana.percobaan1;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen integerObject;
        integerObject = new NonGen(88);
        integerObject.showType();

        int v = (Integer) integerObject.getob();
        System.out.println("Value: " + v);

        NonGen strOb = new NonGen("Non-Generics Test");
        strOb.showType();

        String str = (String) strOb.getob();
        System.out.println("Value: " + str);

        // Ini yang menyebabkan exception
        integerObject = strOb;
        v = (Integer) integerObject.getob();
    }
}
