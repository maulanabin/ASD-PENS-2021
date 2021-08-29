package com.maulana.latihan5;

public class Latihan5 {
    public static<T extends Comparable> void shellSort2(T[] arr) {
        int n = arr.length;
        int C,M ;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        T temp ;
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
                    if (arr[j].compareTo(arr[i])<0) {
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
