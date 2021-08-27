package com.maulana.percobaan2;

public class BubbleDemo2 {
    public static void bubbleSort(int[] arr) {
        int i = 1, j, n = arr.length;
        int temp;

        while (i < n) {
            j = n - 1;
            while  (j >= i) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }
    public static void tampil(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

