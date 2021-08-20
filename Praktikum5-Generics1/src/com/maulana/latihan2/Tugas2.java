package com.maulana.latihan2;

import java.util.Arrays;

public class Tugas2 {
    public static void main(String[] args) {
        String[] siswa = {"Budi", "Aldi", "Rendi", "Siti", "Rudi", "Zendik"};
        System.out.println(Arrays.toString(siswa));
        tukar(siswa, 4, 0);
        System.out.println(Arrays.toString(siswa));;

    }
    public static <T> void tukar (T[] array, int x, int y) {
        T save = array[x];
        array[x] = array[y];
        array[y] = save;
    }
}
