package com.maulana.latihan1;
import java.util.Comparator;

public class IpkComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Mahasiswa m1 = (Mahasiswa) o1;
        Mahasiswa m2 = (Mahasiswa) o2;
        return m1.getIpk().compareTo(m2.getIpk());
    }
}
