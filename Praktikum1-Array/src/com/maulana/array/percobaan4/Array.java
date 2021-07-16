package com.maulana.array.percobaan4;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4};
        System.out.println("Is array 1 equal to array 2? " + Arrays.equals(array, array1));
        System.out.println("is array 1 equal to array 3? " + Arrays.equals(array, array2));


    }
}
