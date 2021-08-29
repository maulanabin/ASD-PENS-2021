package com.maulana.latihan4;

public class Latihan4 {
    public static<T extends Number> void shellSort(T[] A) {
        int n = A.length;
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
                    if (A[j].doubleValue() < A[i].doubleValue()) {
                        temp = A[j];
                        A[j] = A[i];
                        A[i] = temp;
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

