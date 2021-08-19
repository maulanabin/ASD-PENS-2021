package com.maulana.latihan1;

public class Mahasiswa implements Comparable {
    private String nrp;
    private String nama;
    private double ipk;

    public Mahasiswa(String nrp, String nama, double ipk) {
        this.nrp = nrp;
        this.nama = nama;
        this.ipk = ipk;

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
    public  String getIpk() {
        return String.valueOf(ipk);
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nrp = " + nrp + " Nama = " + nama + " IPK = " + ipk + '}';
    }
    public int compareTo(Object o) {
        Mahasiswa m2 = (Mahasiswa) o;
        return this.nrp.compareTo(m2.nrp);
    }

}
