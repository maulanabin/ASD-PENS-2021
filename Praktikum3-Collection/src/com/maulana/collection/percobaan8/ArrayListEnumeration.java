package com.maulana.collection.percobaan8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class ArrayListEnumeration {
    public static void main(String[] args) {
        // create Vector object
        Vector v = new Vector();

        // Add elements to vector
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        v.add("F");
        System.out.println("Vector contains: " + v);

        // Get Enumeration over Vector

        Enumeration e = v.elements();
        // Create ArrayList from Enumeration of Vector
        ArrayList aList = Collections.list(e);
        System.out.println("Arraylist contains: " + aList);
    }
}
