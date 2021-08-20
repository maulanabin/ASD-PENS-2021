package com.maulana.percobaan5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenericDemo {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Hello");
        data.add("Goodbye");

        // data.add(new Date()); // This won't compile!

        Iterator<String> it = data.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
