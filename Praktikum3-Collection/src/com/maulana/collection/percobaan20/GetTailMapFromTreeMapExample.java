package com.maulana.collection.percobaan20;

import java.util.SortedMap;
import java.util.TreeMap;

public class GetTailMapFromTreeMapExample {
    public static void main(String[] args) {
        // create TreeMap object
        TreeMap treeMap = new TreeMap();

        // add key value pairs to TreeMap
        treeMap.put("1", "One");
        treeMap.put("2", "Two");
        treeMap.put("3", "Three");
        treeMap.put("5", "Five");
        treeMap.put("4", "Four");

        SortedMap sortedMap = treeMap.tailMap("2");
        System.out.println("Tail Map Constains: " + sortedMap);
    }
}
