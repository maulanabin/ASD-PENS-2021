package com.maulana.collection.percobaan18;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class CreateHashTableFromHashMap {
    public static void main(String[] args) {
        // create HashMap
        HashMap hMap = new HashMap();

        // populate  HashMap
        hMap.put("1", "One");
        hMap.put("2", "Two");
        hMap.put("3", "Three");

        // create new Hashtable
        Hashtable ht = new Hashtable();

        // populate Hashtable
        ht.put("1", "This value would be REPLACED!!");
        ht.put("4", "Four");

        // print values of Hashtable before copy from HashMap
        System.out.println("Hashtable contents before copy");
        Enumeration e = ht.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        ht.putAll(hMap);

        // display contents of Hashtable
        System.out.println("Hashtable contents after copy");
        e = ht.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
