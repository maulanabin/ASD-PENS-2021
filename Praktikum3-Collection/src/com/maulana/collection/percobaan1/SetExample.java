package com.maulana.collection.percobaan1;
import java.util.*;
public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Bernadine");
        set.add("Elizabeth");
        set.add("Gene");
        set.add("Clara");
        System.out.print("Elemen pada HashSet: ");
        System.out.println(set);
        Set sortSet = new TreeSet(set);
        System.out.print("Elemen pada TreeSet: ");
        System.out.println(sortSet);
    }
}
