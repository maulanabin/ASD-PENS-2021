package com.maulana.collection.latihan5;

public class Mahasiswa2 implements Comparable<Mahasiswa2> {
    public int nrp;
    public String nama;
    public float nilai;

    public Mahasiswa2(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = 60 + (float) Math.random() * 40;
    }
    @Override
    public int compareTo(Mahasiswa2 mhs) {
        return (int) (this.nilai-mhs.nilai);
    }
    public float cetakNilai() {
        return nilai;
    }
    public int cetakNrp() {
        return nrp;
    }
    public String cetakNama() {
        return nama;
    }

}
