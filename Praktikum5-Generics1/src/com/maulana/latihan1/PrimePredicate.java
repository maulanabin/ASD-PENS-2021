package com.maulana.latihan1;

public class PrimePredicate implements UnaryPredicate<Integer> {
    public boolean test(Integer i) {
        int countZero = 0;
        for ( int j = 1; j <= i; j++) {
            if (i % j == 0) {
                countZero++;
            }
        }
        if (countZero == 2) {
            return true;
        } else {
            return false;
        }
    }
}
