package com.maulana.latihan4;

public class Exercise4 {
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
    public static <T> void tampil(T data[]) {
        for (T objek : data) {
            System.out.print(objek + " ");
        }
        System.out.println();
    }
}
