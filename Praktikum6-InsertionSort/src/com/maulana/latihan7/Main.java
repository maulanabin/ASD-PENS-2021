package com.maulana.latihan7;

public class Main {
    public static void main(String[] args) {
        Mahasiswa dataMhs[] = {new Mahasiswa("02", "Budi"), new Mahasiswa("01", "Andi"),
                new Mahasiswa("04", "Udin"), new Mahasiswa("03", "Candra")};
        Exercise7.insertionSort2(dataMhs);
        Exercise7.tampil(dataMhs);
    }
}
