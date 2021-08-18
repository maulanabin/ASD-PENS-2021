package com.maulana.collection.latihan5;

import com.maulana.collection.latihan4.Mahasiswa;

import java.util.*;
import java.util.Collections;
public class Tugas5 {
    public static void main(String[] args) {
        List<Mahasiswa2> mhs = new LinkedList<Mahasiswa2>();
        int[] nrp = {1, 2, 3, 4};
        String[] nama = {"Evelin", "Andini", "Salsa", "Feby"};
        int i = 0;
        while (i < nama.length) {
            mhs.add(new Mahasiswa2(nrp[i], nama[i]));
            i++;
        }
        System.out.println("\t++ Data Mahasiswa ++");
        Collections.sort(mhs);
        for (Mahasiswa2 mahasiswa : mhs) {
            System.out.println("Nama: " + mahasiswa.cetakNama() + "|NRP: " + mahasiswa.cetakNrp() + "|Nilai: " + mahasiswa.cetakNilai());
        }
    }
}