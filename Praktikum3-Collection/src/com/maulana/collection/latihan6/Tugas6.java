package com.maulana.collection.latihan6;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml = 0, i = 0;
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();
        TreeMap<String, Integer> map = new TreeMap();
        String[] pc = kata.split("");
        while(i < pc.length) {
            if (map.containsKey(pc[i])) {
                jml = map.get(pc[i]);
                map.put(pc[i], jml + 1);
            } else {
                map.put(pc[i], 1);
            }
            i++;
        }
        System.out.println(map);
    }
}
