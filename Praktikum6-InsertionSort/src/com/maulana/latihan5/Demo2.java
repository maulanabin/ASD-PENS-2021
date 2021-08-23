package com.maulana.latihan5;

public class Demo2 {
    public static void main(String[] args) {
        Float[] numbers1 = {1.3f, 5.2f, 6.6f, 2.7f, 8.8f, 9.1f};
        Exercise5.insertionSort(numbers1);
        Exercise5.tampil(numbers1);
        Byte[] numbers2 = {6, 7, 11, 1, 3, 2};
        Exercise5.insertionSort(numbers2);
        Exercise5.tampil(numbers2);
    }
}
