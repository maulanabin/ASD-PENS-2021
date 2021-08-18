package com.maulana.collection.latihan8;

import java.util.SortedMap;
import java.util.TreeMap;
public class Tugas8 {
    public static void main(String[] args) {
        TreeMap<String, TreeMap<String, String>>pulau=new TreeMap();
        TreeMap<String, String>province=new TreeMap();
        pulau.put("Sumatera", new TreeMap<String, String>());
        TreeMap<String, String> sumatra=pulau.get("Sumatera");
        sumatra.put("Nagroe Aceh Darussalam", "Banda Aceh");
        sumatra.put("Sumatera Utara", "Medan");
        sumatra.put("Riau", "Pekanbaru");
        sumatra.put("Sumatera Barat", "Padang");
        sumatra.put("Kepulauan Riau", "Tanjung Pinang");
        sumatra.put("Lampung", "Bandar Lampung");
        sumatra.put("Bengkulu", "Bengkulu");
        System.out.println("IbukotaProvinsidiSumatera:");
        System.out.println(toStringWrapper(pulau.get("Sumatera")));
        pulau.put("Jawa", new TreeMap<String, String>());
        TreeMap<String, String>jawa=pulau.get("Jawa");
        jawa.put("Banten", "Serang");
        jawa.put("DKI Jakarta", "Jakarta");
        jawa.put("Jawa Timur", "Surabaya");
        jawa.put("Jawa Tengah", "Semarang");
        jawa.put("DI Yogyakarta", "Yogyakarta");
        System.out.println("IbukotaProvinsidiJawa:");
        System.out.println(toStringWrapper(pulau.get("Jawa")));
        pulau.put("Sulawesi", new TreeMap<String, String>());
        TreeMap<String, String>sulawesi=pulau.get("Jawa");
        sulawesi.put("Gorontalo", "Gorontalo");
        sulawesi.put("Sulawesi Utara", "Manado");
        sulawesi.put("Sulawesi Tengah", "Palu");
        sulawesi.put("Sulawesi Barat", "Kota Manuju");
        sulawesi.put("Sulawesi Tenggara", "Kendari");
        sulawesi.put("Sulawesi Selatan", "Makassar");
        System.out.println("IbukotaProvinsiyangberawalanS:");
        for(TreeMap<String,String>a:pulau.values()){
            SortedMap<String, String> b=a.tailMap("S");
            System.out.println(b.size()<=0?(""):toStringWrapper(b));
        }
    }
    private static String toStringWrapper (Object obyek){
        return (obyek.toString().replace("{", "\t").replace("{", " ").replace(",", "\n\t").replace(" = ", " = "));
    }
}
