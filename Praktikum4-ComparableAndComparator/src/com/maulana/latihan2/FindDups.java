package com.maulana.latihan2;
import java.util.*;

public class FindDups {
    public static void main(String[] args) {
        SortedSet<String> s = new TreeSet<String>(ncs);
        for (String a : args)
            if (!s.add(a.toLowerCase()))
                System.out.println("Duplicate detected: " + a);

        System.out.println(s.size() + " distinct words: " + s);
    }

    public static Comparator ncs = new Comparator() {
        @Override
        public int compare(Object word1, Object word2) {
            return word1.toString().compareTo(word2.toString());
        }
    };
}

