package com.maulana.latihan2;

public class Exercise2 {
    public static void insertionSort(Double[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            Double key = numbers[i];
            int j = i - 1;
            while ((j >= 0) && (numbers[j] > key)) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
    }
    public static void tampil(Double[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
