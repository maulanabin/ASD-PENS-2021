package com.maulana.percobaan2;

public class Gen<T> {
    T ob; // Declare an object of type T

    Gen(T o) {
        ob = o;
    }
    T getOb() {
        return ob;
    }
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
