package com.maulana.collection.latihan2;
import java.util.*;

public class Tugas2 {
    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        data.add("m");
        data.add("a");
        data.add("l");
        data.add("a");
        data.add("n");
        data.add("g");

        Iterator itr = data.iterator();
        System.out.print("Data: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.print("\n");

        System.out.print("Data sebelum terbalik: ");
        ListIterator litr = data.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }
        System.out.println();
        System.out.print("Data terbalik: ");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
        System.out.print("\n");
        System.out.print("Data acak: ");
        Collections.shuffle(data);
        System.out.print(data);
        System.out.print("\n");
    }
}
