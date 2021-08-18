package com.maulana.collection.percobaan15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GetSetViewOfKeysFromHashMapExample {
    public static void main(String[] args) {
        // Create HashMap object
        HashMap hMap = new HashMap();

        // Add key value pairs to HashMap
        hMap.put("1", "One");
        hMap.put("2", "Two");
        hMap.put("3", "Three");

        Set st = hMap.keySet();

        System.out.println("Set created from HashMap Keys contains: ");

        // Iterate through the Set of keys
        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // remove 2 from Set
        st.remove("2");
    }
}
