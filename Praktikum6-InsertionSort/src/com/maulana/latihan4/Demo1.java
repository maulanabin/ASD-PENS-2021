package com.maulana.latihan4;

public class Demo1 {
    public static void main(String[] args) {
        // Data Integer
        Integer[] numbersOfInteger = {1, 5, 6, 2, 8, 9};
        Exercise4.insertionSort(numbersOfInteger);
        Exercise4.tampil(numbersOfInteger);
        // Data Double
        Double[] numbersOfDouble = {1.3, 5.2, 6.6, 2.7, 8.8, 9.1};
        Exercise4.insertionSort(numbersOfDouble);
        Exercise4.tampil(numbersOfDouble);
    }

}
