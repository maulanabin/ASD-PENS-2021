package com.maulana.latihan1;
import java.util.Arrays;
import java.util.*;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] dataMhs = {new Mahasiswa("05", "Cahya", 3.78), new
                Mahasiswa("04", "Rudi", 4.00), new Mahasiswa("01", "Endah", 3.24), new
                Mahasiswa("03", "Rita", 3.50), new Mahasiswa("02", "Tika", 3.66)};
        System.out.println("\t\t\t\t\tSEBELUM SORTING");
        System.out.println(Arrays.toString(dataMhs));
        Arrays.sort(dataMhs);
        System.out.println("\n\t\t\t\t\tSESUDAH SORTING NRP");
        System.out.println(Arrays.toString(dataMhs));
        Arrays.sort(dataMhs, new NamaComparator());
        System.out.println("\n\t\t\t\t\tSESUDAH SORTING NAMA");
        System.out.println(Arrays.toString(dataMhs));
        Arrays.sort(dataMhs, new IpkComparator());
        System.out.println("\n\t\t\t\t\tSESUDAH SORTING IPK");
        System.out.println(Arrays.toString(dataMhs));
    }
}
