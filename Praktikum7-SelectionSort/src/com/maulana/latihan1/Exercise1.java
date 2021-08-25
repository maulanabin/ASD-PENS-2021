package com.maulana.latihan1;

public class Exercise1 {
    public static void selectionSort(Integer[] numbers) {
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
    public static void tampil(Integer[] data)  {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
