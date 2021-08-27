package com.maulana.latihan6;

public class Main {
    public static void main(String[] args) {
        Mahasiswa arr8[] = {new Mahasiswa("02", "Budi"), new
                Mahasiswa("01", "Andi"), new Mahasiswa("04", "Udin"), new
                Mahasiswa("03", "Candra")};
        Exercise6.bubbleSort2(arr8);
        Exercise6.tampil(arr8);
    }
}
