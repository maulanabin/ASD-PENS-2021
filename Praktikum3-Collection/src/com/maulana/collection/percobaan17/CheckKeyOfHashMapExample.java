package com.maulana.collection.percobaan17;

import java.util.HashMap;

public class CheckKeyOfHashMapExample {
    public static void main(String[] args) {
        // Create HashMap object
        HashMap hMap = new HashMap();

        // Add key value pairs to HashMap
        hMap.put("1", "One");
        hMap.put("2", "Two");
        hMap.put("3", "Three");

        boolean blnExists = hMap.containsKey("3");

        System.out.println("3 exists in HashMap? : " + blnExists);
    }
}
