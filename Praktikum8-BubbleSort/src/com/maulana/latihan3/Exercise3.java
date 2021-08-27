package com.maulana.latihan3;

public class Exercise3 {
    public static<T> void bubbleSort(Integer[] a) {
        int i = 1, j, n = a.length;
        int temp;
        while (i < n) {
            j = n - 1;
            while (j >= i) {
                if (a[j - 1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }
    public static<T> void bubbleSort(Double[] a) {
        int i = 1, j, n = a.length;
        double temp;
        while (i < n) {
            j = n - 1;
            while (j >= i) {
                if (a[j - 1] > a[j]) {
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
