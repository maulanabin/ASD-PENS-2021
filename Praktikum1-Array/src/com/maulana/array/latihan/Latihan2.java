package com.maulana.array.latihan;

import java.util.*;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] warna = {"Ungu", "Biru", "Hitam", "Merah", "Hijau", "Kuning", "Putih", "Ungu"};
        String[] sifat = {
                "Warna Ungu adalah pribadi dengan tipe yang benar-benar luar biasa. Selalu optimis, dalam menghadapi masa\n" +
                        "depan kamu tidak pernah ragu-ragu, apa yang dikerjakan kamu adalah yang terbaik. Kamu pandai benar dalam\n" +
                        "mengikuti perkembangan jaman. Dalam bercinta, hanya merekalah yang kuat mental yang bisa mendekati dan\n" +
                        "menjadi kekasih kamu.",
                "Warna kesukaan kamu Biru, biasanya termasuk tipe pemurung, selalu menyenangkan dan selalu bertindak pasif\n" +
                        "dalam segala hal. Selalu mengharapkan kedamaian dan ketenangan. Kamu memiliki kesulitan dalam pergaulan.\n" +
                        "Demikian pula dalam bercinta karena kamu sering sekali menyembunyikan perasaan.",
                "Kamu termasuk tipe orang yang sangat lincah dalam hal-hal tertentu saja. Jika berada dilingkungan yang tidak\n" +
                        "disukai, maka kamu akan menjadi murung. Kamu selalu tampil menarik, rapi, cukup banyak lawan jenis berusaha\n" +
                        "mengejar dan merebut cinta kamu.",
                "Kamu sangat berwibawa dan juga senang melindungi orang yang lemah. Walau sering kali bergaul dan bercanda\n" +
                        "tapi kamu bisa menahan diri. Banyak orang mengatakan cinta, tapi kamu selalu berpikir dan berpikir lagi. Kamu\n" +
                        "termasuk tipe yang sulit jatuh cinta.",
                "Jika warna favorit kamu hijau, maka kamu adalah tipe yang sangat romantik, menyukai keindahan, menyenangi\n" +
                        "alam dengan udara yang sejuk. Kamu adalah seseorang yang selalu memegang prinsip. Dalam hal bercinta kamu\n" +
                        "mengidam-idamkan calon teman hidup yang penuh toleransi dan dapat dipercaya.",
                "Kesukaan kamu warna kuning menandakan bahwa kamu memiliki sifat optimis. Kamu tipe periang dan senang\n" +
                        "bergaul, tidak memiliki penampilan yang loyo. Sifat tolong-menolong selalu ada dalam diri kamu, karena menolong\n" +
                        "merupakan suatu kewajiban mutlak bagi kamu. Kamu orang yang tidak pernah meremehkan siapapun juga,\n" +
                        "walaupun seseorang itu dungu atau bloon.",
                "Kamu adalah orang yang dilahirkan ke dunia dengan sempurna, jika menyukai warna putih, banyak orang\n" +
                        "mengagumi kamu karena sifat angun, sifat idealis dan moral kamu yang teramat tinggi. Tak pernah angkuh, senang\n" +
                        "menolong siapa saja yang membutuhkan bantuan kamu.",
                "Warna Ungu adalah pribadi dengan tipe yang benar-benar luar biasa. Selalu optimis, dalam menghadapi masa\n" +
                        "depan kamu tidak pernah ragu-ragu, apa yang dikerjakan kamu adalah yang terbaik. Kamu pandai benar dalam\n" +
                        "mengikuti perkembangan jaman. Dalam bercinta, hanya merekalah yang kuat mental yang bisa mendekati dan\n" +
                        "menjadi kekasih kamu."


        };
        int pilih = 0;
        do {
            try {
                System.out.println();
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\tProgram Menebak Karakter Warna Kesukaan");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.println("\t\t\t\t\t>> Pilihan Menu <<");
                System.out.println("1. Pilih Warna");
                System.out.println("2. Keluar");
                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                System.out.print("Pilihan Anda: ");
                pilih = userInput.nextInt(); userInput.nextLine();

                System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan warna yang Anda sukai: ");
                        String inputWarna = userInput.nextLine();
                        int indexWarna = Arrays.asList(warna).indexOf(inputWarna);
                        if (indexWarna != -1) {
                            System.out.print("Karakter Anda: " + sifat[indexWarna]);
                        } else {
                            System.out.println("Warna tidak ditemukan!");
                        }
                        break;
                    case 2:
                        System.out.println("Anda telah keluar");
                        System.out.println("== Terima Kasih ==");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan salah!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁 🍁");
        } while (pilih > 0 && pilih <= 2);
    }
}
