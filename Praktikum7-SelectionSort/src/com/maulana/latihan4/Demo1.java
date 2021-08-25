package com.maulana.latihan4;

public class Demo1 {
    public static<T extends Number>void selectionSort(T[] numbers) {
        // index of smallest element in the sublist
        int smallIndex;
        int pass, j, n = numbers.length;
        T temp;

        for (pass = 0; pass < n - 1; pass++) {
            smallIndex = pass;
            for (j = pass + 1; j < n; j++) {
                if (numbers[j].doubleValue() < numbers[smallIndex].doubleValue()) {
                    smallIndex = j;
                }
            }
            // tukar nilai terkecil dengan numbers[pass]
            temp = numbers[pass];
            numbers[pass] = numbers[smallIndex];
            numbers[smallIndex] = temp;
        }
    }
    public static <T>void tampil(T[] data) {
        for (T objek : data) {
            System.out.print(objek + " ");
        }
        System.out.println();
    }

}
