package com.maulana.latihan5;

public class Demo2 {
    public static <T extends Comparable> void selectionSort2(T[] arr) {
        // index of smallest element in the sublist
        int smallIndex;
        int pass, j, n = arr.length;
        T temp;

        for (pass = 0; pass < n - 1; pass++) {
            smallIndex = pass;
            for (j = pass + 1; j < n; j++) {
                if (arr[j].compareTo(arr[smallIndex])>0) {
                    smallIndex = j;
                }
            }
            // tukar nilai terkecil dengan A[pass]
            temp = arr[pass];
            arr[pass] = arr[smallIndex];
            arr[smallIndex] = temp;
        }
    }

    public static <T> void tampil(T data[]) {
        for (T objek : data) {
            System.out.print(objek + " ");
        }
        System.out.println();
    }
}
