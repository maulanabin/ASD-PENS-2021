package com.maulana.praktikum2;

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
    public boolean transfer(Tabungan tab, int jumlah) {
        if (saldo <= jumlah) {
            return false;
        } else {
            saldo -= jumlah;
            tab.simpanUang(jumlah);
            return true;
        }
    }
}

