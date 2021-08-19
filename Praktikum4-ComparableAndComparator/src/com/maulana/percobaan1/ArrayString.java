package com.maulana.percobaan1;
import java.util.Arrays;
public class ArrayString {
    public static void main(String[] args) {
        String[] animals = new String[6];
        animals[0] = "snake";
        animals[1] = "kangaroo";
        animals[2] = "wombat";
        animals[3] = "bird";

        System.out.println("\nSEBELUM DI-SORTING");
        for (int i = 0; i < 4; i++) {
            System.out.println("Animal " + i + " : " + animals[i]);
        }
        Arrays.sort(animals, 0, 4);
        System.out.println("\nSETELAH DI-SORTING");
        for (int i = 0; i < 4; i++) {
            System.out.println("Animal " + i + " : " + animals[i]);
        }
    }

}
