package com.maulana.percobaan2;
import java.util.ArrayList;
import java.util.Collections;
public class SortList {
    public static void main(String[] args) {
        ArrayList insects = new ArrayList();
        insects.add("Mosquito");
        insects.add("Butterfly");
        insects.add("Dragonfly");
        insects.add("Fly");

        System.out.println("\nSEBELUM DI-SORTING");
        int size = insects.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Insect " + i + " : " + (String) insects.get(i));
        }
        Collections.sort(insects);
        System.out.println("\nSETELAH DI-SORTING");
        for (int i = 0; i < size; i++) {
            System.out.println("Insect " + i + " : " + (String) insects.get(i));
        }
    }
}
