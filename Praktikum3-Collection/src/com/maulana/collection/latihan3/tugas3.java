package com.maulana.collection.latihan3;
import java.util.*;
public class tugas3 {
    public static void main(String[] args) {
        List warna = new LinkedList();
        warna.add("MAGENTA");
        warna.add("RED");
        warna.add("WHITE");
        warna.add("BLUE");
        warna.add("CYAN");

        List hapusWarna = new LinkedList();
        hapusWarna.add("RED");
        hapusWarna.add("WHITE");
        hapusWarna.add("BLUE");
        warna.removeAll(hapusWarna);
        System.out.println("Warna: ");
        System.out.print(warna);

    }
}
