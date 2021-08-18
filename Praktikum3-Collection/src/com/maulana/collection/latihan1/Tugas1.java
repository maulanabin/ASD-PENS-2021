package com.maulana.collection.latihan1;
import java.util.*;

public class Tugas1 {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");
        set1.add("5");
        System.out.println("Elemen Himpunan A: " + set1);

        Set set2 = new HashSet();
        set2.add("5");
        set2.add("6");
        set2.add("7");
        set2.add("8");
        set2.add("9");
        set2.add("10");
        System.out.println("Elemen Himpunan B: " + set2);

        Set irisan = new TreeSet(set1);
        irisan.retainAll(set2);
        System.out.println("A ^ B: " + irisan);

        Set gabungan = new TreeSet(set1);
        gabungan.addAll(set2);
        System.out.println("A U B: " + gabungan);

        Set komplemen = new TreeSet(set1);
        komplemen.removeAll(set2);
        System.out.println("A - B: " + komplemen);

        Set subset1 = new TreeSet(set1);
        subset1.removeAll(set2);

        Set subset2 = new TreeSet(set2);
        subset2.removeAll(set1);

        System.out.println("A c B: " + subset1 + subset2);
    }
}
