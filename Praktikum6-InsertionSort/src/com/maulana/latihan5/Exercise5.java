package com.maulana.latihan5;

public class Exercise5 {
    public static <T extends Number> void insertionSort(T[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            T key = numbers[i];
            int j = i - 1;
            while ((j >= 0) && (numbers[j].doubleValue() > key.doubleValue())) {
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
