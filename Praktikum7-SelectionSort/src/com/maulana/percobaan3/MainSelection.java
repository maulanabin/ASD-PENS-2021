package com.maulana.percobaan3;

public class MainSelection {
    public static void main(String[] args) {
        double[] data = {10.3, 6.2, 8.4, 3.6, 1.1};
        SelectionSort.tampil(data);
        SelectionSort.selectionSort(data);
        SelectionSort.tampil(data);
    }
}
