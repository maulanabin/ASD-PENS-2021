package com.maulana.latihan4;

public class Exercise4 {
    public static <T extends Number> void bubbleSort(T[] a) {
        int i = 1, j, n = a.length;
        T temp;
        while (i < n) {
            j = n - 1;
            while (j >= i) {
                if (a[j - 1].doubleValue() < a[j].doubleValue()) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }
    public static <T> void tampil(T[] data) {
        for (T objek : data) {
            System.out.print(objek + " ");
        }
        System.out.println();
    }
}
