package com.maulana.praktikum.referensi;

public class Tabungan {
    public int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }
    public boolean ambilUang(int jumlah) {
        if ((saldo - jumlah) < 0) {
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }
}
