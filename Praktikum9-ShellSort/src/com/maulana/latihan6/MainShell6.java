package com.maulana.latihan6;

public class MainShell6 {
    public static void main(String[] args) {
        Mahasiswa arr8[] = {new Mahasiswa("02", "Budi"), new
                Mahasiswa("01", "Andi"), new Mahasiswa("04", "Udin"), new
                Mahasiswa("03", "Candra")};
        Latihan6.shellSort2(arr8);
        Latihan6.tampil(arr8);
    }
}

