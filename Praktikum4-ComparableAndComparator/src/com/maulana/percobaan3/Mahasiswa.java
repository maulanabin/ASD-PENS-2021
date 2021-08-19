package com.maulana.percobaan3;

public class Mahasiswa {
    private String nrp;
    private String nama;

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNrp() {
        return nrp;
    }
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
    @Override
    public String toString() {
        return "Mahasiswa{" + "nrp = " + nrp + " nama = " + nama + '}';
    }
}
