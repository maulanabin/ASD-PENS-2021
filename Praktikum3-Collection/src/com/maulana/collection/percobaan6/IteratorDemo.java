package com.maulana.collection.percobaan6;
import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        // create an array list
        ArrayList al = new ArrayList();
        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        // use iterator to display contents of al
        System.out.print("Original of al: ");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.print("\n");
        // modify objects being iterated
        ListIterator litr = al.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
            System.out.print("\n");
        }
        // now, display the last backwards
        System.out.print("Modified list backwards: ");
        while (litr.hasPrevious()) {
            Object element = litr.hasPrevious();
            System.out.print(element + " ");
        }
        System.out.print("\n");
    }
}
