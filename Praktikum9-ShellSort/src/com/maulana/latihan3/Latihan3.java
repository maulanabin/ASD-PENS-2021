package com.maulana.latihan3;

public class Latihan3 {
    public static<T> void shellSort(Double[] arr) {
        int n = arr.length;
        int C,M ;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        Double temp ;
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

    public static void shellSort(Integer[] arr) {
        int n = arr.length;
        int C,M ;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        Integer temp ;
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

    public static<T> void tampil(T data[]){
        for(T objek : data)
            System.out.print(objek);
    }
}

