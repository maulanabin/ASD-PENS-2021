package com.maulana.latihan6;

public class Exercise6 {
    public static <T extends Comparable> void insertionSort2(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T key = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j].compareTo(key) > 0)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static <T> void tampil (T data[]) {
        for (T objek : data) {
            System.out.print(objek + " ");
        }
        System.out.println();
    }
}
