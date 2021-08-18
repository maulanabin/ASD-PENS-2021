package com.maulana.collection.latihan7;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class Tugas7 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int jml=0;
        int i=0;
        String kata;
        System.out.print("Enter some katas : ");
        kata = in.nextLine();
        TreeMap<String,Integer> tools=new TreeMap();
        String[]pc=kata.split("");
        while(i<pc.length){
            if(tools.containsKey(pc[i])){
                jml = tools.get(pc[i]);
                tools.put(pc[i], jml+1);
            }
            else {
                tools.put(pc[i], 1);
            }
            i++;
        }
        class treeMappComparator implements Comparator<Map.Entry<String, Integer>> {
            public int compare(Map.Entry<String,Integer>aa,Map.Entry<String,Integer>bb){
                return aa.getValue().compareTo(bb.getValue());
            } }
        System.out.println(tools);
        System.out.println("Min:"+Collections.min(tools.entrySet(),new treeMappComparator()));
        System.out.println("Max:"+Collections.max(tools.entrySet(),new treeMappComparator()));
        System.out.println("Dengan awala nm:"+tools.subMap("m",true,"t",false));}
}