package com.maulana.praktikum1;

public class Tabungan {
    private int saldo;

    public Tabungan(int initSaldo) {
        this.saldo = initSaldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }
    public boolean ambilUang(int jumlah) {
        if (saldo > jumlah) {
            saldo-= jumlah;
            return true;
        } else {
            return false;
        }
    }
}
