package com.maulana.latihan2;
import java.util.*;

public class FindDupsWithComparable {
    public static void main(String[] args) {
        SortedSet<DupsComparator> s = new TreeSet<DupsComparator>();
        for (String a : args)
            if (!s.add(new DupsComparator(a.toLowerCase())))
                System.out.println("Duplicate detected: " + a);

        System.out.println(s.size() + " distinct words: " + s);
    }
}

class DupsComparator implements Comparable {
    private String word;

    public DupsComparator(String word) {
        this.word = word;
    }

    public String getString() {
        return word;
    }

    public int compareTo(Object o) {
        return word.compareTo(((DupsComparator) o).getString());
    }

    public String toString() {
        return word;
    }
}

