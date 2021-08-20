package com.maulana.latihan1;
import java.util.Arrays;
import java.util.Collection;

public class Tugas1 {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(ci, new PrimePredicate());
        System.out.println("Number of prime integers = " + count);
    }
}
