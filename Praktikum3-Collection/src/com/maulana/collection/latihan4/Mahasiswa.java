package com.maulana.collection.latihan4;

import java.util.*;
import java.util.Comparator;

public class Mahasiswa implements Comparable<Mahasiswa>{
    public int nrp;
    public String nama;
    public float nilai;
    public Mahasiswa(int nrp, String nama){
        this.nrp = nrp;
        this.nama = nama;
    }

    public int cetakNrp() {
        return nrp;
    }

    public String cetakNama() {
        return nama;
    }

    @Override
    public int compareTo(Mahasiswa m){
        return (int)(this.nrp-m.nrp);
    }
}