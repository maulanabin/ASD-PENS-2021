package com.maulana.praktikum2;

public class MainTabungan {
    public static void main(String[] args) {
        boolean status;
        Tabungan[] tab = new Tabungan[4];
        tab[0] = new Tabungan(1000);
        tab[1] = new Tabungan(1000);

        System.out.println("Saldo awal Nasabah ke-1: " + tab[0].getSaldo());
        System.out.println("Saldo awal Nasabah ke-2: " + tab[1].getSaldo());
        status = tab[0].transfer(tab[1], 500);
        System.out.print("Transfer sebesar " + 500);
        if (status) {
            System.out.println(" OK");
        } else {
            System.out.println(" Gagal");
        }

        System.out.println("Saldo sekarang Nasabah ke-1: " + tab[0].getSaldo());
        System.out.println("Saldo sekarang Nasabah ke-2: " + tab[1].getSaldo());
    }
}

