package com.maulana.percobaan3;

public class ShellDemo {
    public static void shellSort(double[] arr) {
        int n = arr.length;
        int C,M ;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        double temp ;
        C = 0;
        M = 0;
        jarak = n;
        while (jarak >= 1) {
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = j + jarak;
                    C++;
                    if (arr[j]> arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }
    public static void tampil(double data[]){
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }
}

