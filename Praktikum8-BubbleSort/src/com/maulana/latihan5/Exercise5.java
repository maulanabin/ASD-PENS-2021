package com.maulana.latihan5;

public class Exercise5 {
    public static <T extends Comparable> void bubbleSort(T[] arr) {
        int i = 1, j, n = arr.length;
        T temp;
        while (i < n) {
            j = n - 1;
            while (j >= i) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
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

