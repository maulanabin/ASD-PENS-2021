package com.maulana.collection.latihan4;
import java.util.*;
import java.util.Collections;
public class Tugas4 {
    public static void main(String[] args) {
        List<Mahasiswa> mhs = new LinkedList<Mahasiswa>();
        int[] nrp = {1, 2, 3, 4};
        String[] nama = {"Evelin", "Andini", "Salsa", "Feby"};
        int i = 0;
        while (i < nama.length) {
            mhs.add(new Mahasiswa(nrp[i], nama[i]));
            i++;
        }
        System.out.println("\t\t++ Data ++");
        for (Mahasiswa mahasiswa : mhs) {
            System.out.println("Nama: " + mahasiswa.cetakNama() + "|NRP: " + mahasiswa.cetakNrp());
        }
        System.out.print("\n");
        System.out.println("\t\t++ Dibalik ++");
        Collections.reverse(mhs);
        for (Mahasiswa mahasiswa : mhs) {
            System.out.println("Nama: " + mahasiswa.cetakNama() + "|NRP: " + mahasiswa.cetakNrp());
        }
        System.out.print("\n");
        System.out.println("\t++ Setelah Diacak ++");
        Collections.shuffle(mhs);
        for (Mahasiswa mahasiswa : mhs) {
            System.out.println("Nama: " + mahasiswa.cetakNama() + "|NRP: " + mahasiswa.cetakNrp());
        }
        System.out.print("\n");
        System.out.println("\t++ Setelah Diurutkan ++");
        Collections.sort(mhs);
        for(Mahasiswa mahasiswa : mhs){
            System.out.println("Nama:"+mahasiswa.cetakNama()+"|NRP:"+ mahasiswa.cetakNrp());
        }
    }
}
