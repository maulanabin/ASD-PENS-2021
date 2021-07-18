package com.maulana.praktikum1;

public class MainTabungan {
    public static void main(String[] args) {
        boolean status;
        Tabungan tab = new Tabungan(5000);
        System.out.println("Saldo awal: " + tab.getSaldo());
        tab.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan: 3000");
        status = tab.ambilUang(6000);
        System.out.print("Jumlah uang yang diambil: 6000 ");
        if (status) {
            System.out.println("OK");
        } else {
            System.out.println("Gagal");
        }

        tab.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan: 3500");
        status = tab.ambilUang(4000);
        System.out.print("Jumlah uang yang diambil: 4000 ");
        if (status) {
            System.out.println("OK");
        } else {
            System.out.println("Gagal");
        }
        status = tab.ambilUang(1600);
        System.out.print("Jumlah uang yang diambil: 1600 ");
        if (status) {
            System.out.println("OK");
        } else {
            System.out.println("Gagal");
        }

        tab.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan: 2000");
        System.out.println("Saldo sekarang: " + tab.getSaldo());
    }
}
