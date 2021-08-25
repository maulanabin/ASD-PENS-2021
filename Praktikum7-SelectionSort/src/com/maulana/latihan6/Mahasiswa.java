package com.maulana.latihan6;

public class Mahasiswa implements Comparable <Mahasiswa> {
    private String nrp ;
    private String nama ;
    Mahasiswa(String nrp, String nama){
        this.nrp=nrp;
        this.nama=nama;
    }
    @Override
    public int compareTo(Mahasiswa o){
        Mahasiswa mhs = (Mahasiswa)o;
        return nrp.compareTo(mhs.nrp);
    }
    @Override
    public String toString() {
        return " Nrp : "+nrp+" Nama : "+nama+"\n";
    }
}

