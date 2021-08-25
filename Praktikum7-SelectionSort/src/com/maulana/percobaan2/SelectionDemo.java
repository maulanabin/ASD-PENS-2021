package com.maulana.percobaan2;

public class SelectionDemo {
    public static void  selectionSort(int[] arr) {
        // index of smallest element in the sublist
        int smallIndex;
        int pass, j, n = arr.length;
        int temp;

        for (pass = 0; pass < n - 1; pass++) {
            smallIndex = pass;
            for (j = pass + 1; j < n; j++) {
                if (arr[j] > arr[smallIndex]) {
                    smallIndex = j;
                }
            }
            // tukar nilai terkecil dengan arr[pass]
            temp = arr[pass];
            arr[pass] = arr[smallIndex];
            arr[smallIndex] = temp;
        }
    }
    public static void tampil(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
