package com.maulana.collection.percobaan14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class IterateValuesOfHashMapExample {
    public static void main(String[] args) {
        // Create HashMap object
        HashMap hMap = new HashMap();

        // Add key value pairs to HashMap
        hMap.put("1", "One");
        hMap.put("2", "Two");
        hMap.put("3", "Three");

        Collection c = hMap.values();
        // Obtain an Iterator for Collection
        Iterator itr = c.iterator();

        // Iterate through HashMap values iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
