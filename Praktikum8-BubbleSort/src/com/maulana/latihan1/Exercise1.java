package com.maulana.latihan1;

public class Exercise1 {
    public static void bubbleSort(Integer[] a) {
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
    public static <T> void tampil(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
