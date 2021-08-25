package com.maulana.latihan4;

public class MainSelection {
    public static void main(String[] args) {
        Float[] data1 = {1.3f, 5.2f, 6.6f, 2.7f, 8.8f, 9.1f};
        Demo1.selectionSort(data1);
        Demo1.tampil(data1);

        Byte[] data2 = {6, 7, 11, 1, 3, 2};
        Demo1.selectionSort(data2);
        Demo1.tampil(data2);
    }
}
