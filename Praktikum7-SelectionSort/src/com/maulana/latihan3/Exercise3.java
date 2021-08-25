package com.maulana.latihan3;

public class Exercise3 {
    public static <T> void selectionSort(Integer[] numbers) {
        // index of smallest element in the sublist
        int smallIndex;
        int pass, j, n = numbers.length;
        int temp;

        for (pass = 0; pass < n - 1; pass++) {
            smallIndex = pass;
            for (j = pass + 1; j < n; j++) {
                if (numbers[j] < numbers[smallIndex]) {
                    smallIndex = j;
                }
            }
            // tukar nilai terkecil dengan data[pass]
            temp = numbers[pass];
            numbers[pass] = numbers[smallIndex];
            numbers[smallIndex] = temp;
        }
    }
    public static <T> void selectionSort(Double[] numbers) {
        // index of smallest element in the sublist
        int smallIndex;
        int pass, j, n = numbers.length;
        double temp;

        for (pass = 0; pass < n - 1; pass++) {
            smallIndex = pass;
            for (j = pass + 1; j < n; j++) {
                if (numbers[j] < numbers[smallIndex]) {
                    smallIndex = j;
                }
            }
            // tukar nilai terkecil dengan data[pass]
            temp = numbers[pass];
            numbers[pass] = numbers[smallIndex];
            numbers[smallIndex] = temp;
        }
    }
    public static <T> void tampil(T[] data)  {
        for (T objek : data) {
            System.out.print(objek + " ");
        }
        System.out.println();
    }
}

