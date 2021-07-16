package com.maulana.array.latihan;

import java.util.Arrays;

public class Latihan1 {
    public static void main(String[] args) throws Exception {
        int[] dataArray = {23, 6, 47, 35, 2, 14};
        double total = 0;
        Arrays.sort(dataArray);
        printArray(dataArray);
        System.out.print("\n");
        double average = average(total, dataArray);
        System.out.format("The Average is: %.2f\n", average);
        int max = getMax(dataArray);
        System.out.println("Maximum Value is: " + max);
        int min = getMin(dataArray);
        System.out.println("Minimum Value is: " + min);
        System.out.print("Bilangan Ganjil: ");
        isArrayOdd(dataArray);
        System.out.print("Bilangan Genap: ");
        isArrayEven(dataArray);


    }
    private static void printArray(int[] dataArray) {
        System.out.println("Sorted Array" + ": [length = " + dataArray.length + "]");
        for (int i = 0; i < dataArray.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(dataArray[i]);
        }
        System.out.println();
    }
    private static double average(double total, int[] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            total += dataArray[i];
        }
        return total / dataArray.length;
    }
    private static int getMax(int[] dataArray) {
        int maxValue = dataArray[0];
        for (int i = 1; i < dataArray.length; i++) {
            if (dataArray[i] > maxValue) {
                maxValue = dataArray[i];
            }
        }
        return maxValue;
    }
    private static int getMin(int[] dataArray) {
        int minValue = dataArray[0];
        for (int i = 1; i < dataArray.length; i++) {
            if (dataArray[i] < minValue) {
                minValue = dataArray[i];
            }
        }
        return minValue;
    }
    private static void isArrayOdd(int[] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] % 2 != 0) {
                System.out.print(dataArray[i] + " ");
            }
        }
        System.out.println("");
    }
    private static void isArrayEven(int[] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] % 2 == 0) {
                System.out.print(dataArray[i] + " ");
            }
        }
        System.out.println();
    }
}
