package com.maulana.array.percobaan1;
// Cara membuat array, menyimpan data di array, dan mengakses data dari array.
public class ArrayDemo {
    public static void main(String[] args) {
        // deklarari array dengan tipe data integer
        int[] anArray;
        // mengalokasikan memori dengan panjang elemen array 10 tipe integer
        anArray = new int[10];
        // inisialisasi elemen pertama
        anArray[0] = 100;
        // inisialisasi elemen kedua
        anArray[1] = 200;
        // dan seterusnya.
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Elemen pada indeks ke-0: " + anArray[0]);
        System.out.println("Elemen pada indeks ke-1: " + anArray[1]);
        System.out.println("Elemen pada indeks ke-2: " + anArray[2]);
        System.out.println("Elemen pada indeks ke-3: " + anArray[3]);
        System.out.println("Elemen pada indeks ke-4: " + anArray[4]);
        System.out.println("Elemen pada indeks ke-5: " + anArray[5]);
        System.out.println("Elemen pada indeks ke-6: " + anArray[6]);
        System.out.println("Elemen pada indeks ke-7: " + anArray[7]);
        System.out.println("Elemen pada indeks ke-8: " + anArray[8]);
        System.out.println("Elemen pada indeks ke-9: " + anArray[9]);

    }
}
