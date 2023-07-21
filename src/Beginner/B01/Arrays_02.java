package Beginner.B01;

import java.util.Scanner;

public class Arrays_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Dizi kaç elamanlı olsun?: ");
        int elemanSayisi = scan.nextInt();
        scan.nextLine();
        System.out.println();

        String[] elemanlar = new String[elemanSayisi];

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print("Dizini " + i + ". elamanını giriniz..: ");
            elemanlar[i] = scan.nextLine();
        }

        System.out.println();
        System.out.println("Elemanlarınız:");
        System.out.println();

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(i + "." + " Elemanınız: " + elemanlar[i]);
        }
    }
}

