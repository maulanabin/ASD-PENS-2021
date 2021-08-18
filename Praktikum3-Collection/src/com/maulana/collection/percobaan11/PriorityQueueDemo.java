package com.maulana.collection.percobaan11;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> stringQueue;
        stringQueue = new PriorityQueue<String>();
        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");

        // Don't use iterator which may or not
        // Show the PriorityQueue's order
        while (stringQueue.size() > 0) {
            System.out.println(stringQueue.remove());
        }
    }
}
