package com.maulana.percobaan6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListInAscending {
    public static void main(String[] args) {
        // Create an Arraylist object
        ArrayList arrayList = new ArrayList();

        // Add elements to ArrayList
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        Comparator cmp = Collections.reverseOrder();

        System.out.println("Before sorting ArrayList in descending order: " + arrayList);
        Collections.sort(arrayList, cmp);

        System.out.println("After sorting ArrayList in descending order: " + arrayList);
    }
}
