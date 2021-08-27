package com.maulana.percobaan3;

public class BubbleDemo3 {
    public static void bubbleSort(double[] arr) {
        int i = 1, j, n = arr.length;
        double temp;

        while (i < n) {
            j = n - 1;
            while  (j >= i) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }
    public static void tampil(double[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

