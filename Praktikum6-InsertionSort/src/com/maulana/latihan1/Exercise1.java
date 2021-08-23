package com.maulana.latihan1;

public class Exercise1 {
    public static void insertionSort(Integer[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            Integer key = numbers[i];
            int j = i - 1;
            while ((j >= 0) && (numbers[j] > key)) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
    }
    public static void tampil(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
