package com.maulana.percobaan6;

import java.util.HashMap;

public class GenericMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("Apel", 20);
        hm.put("Anggur", 12);
        hm.put("Jeruk", 5);

        System.out.println(hm);
    }
}
