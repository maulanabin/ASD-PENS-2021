package com.maulana.latihan3;

public class Main3 {
    public static void main(String[] args) {
        Integer[] numbersOfInteger = {15, 20, 5, 10, 1, 8};
        Exercise3.tampil(numbersOfInteger);
        Exercise3.selectionSort(numbersOfInteger);
        Exercise3.tampil(numbersOfInteger);

        Double[] numbersOfDouble = {15.5, 20.5, 5.5, 10.5, 1.5, 8.5};
        Exercise3.tampil(numbersOfDouble);
        Exercise3.selectionSort(numbersOfDouble);
        Exercise3.tampil(numbersOfDouble);
    }
}
