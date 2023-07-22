package Beginner.B01;

import java.util.Scanner;

public class Method_01 {
    public static void main(String[] args) {

        System.out.println("SAYININ TEK Mİ ÇİFT Mİ OLDUĞUNU BULMA PROGRAMI");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz: ");
        int diziLength = scanner.nextInt();
        scanner.nextLine();

        int[] sayilar = new int[diziLength];

        for (int i = 0; i <sayilar.length ; i++) {
            System.out.println("Dizinin " + i + ". index değerini giriniz: ");
            sayilar[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int deger: sayilar) {
            tekMiCiftMi(deger);
        }
    }

    public static void tekMiCiftMi(int sayi){

        if (sayi % 2 == 0){
            System.out.println("Sayi : " + sayi + " ÇİFTTİR");
        } else System.out.println("Sayi : " + sayi + " TEKTİR" );
    }
}
