package Beginner.B01;

import java.util.Scanner;

public class Arrays_Foreach {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int asalToplam = 0;
        int asalOlmayanToplam = 0;

        String asalSayilar = " ";
        String asalOlmayanSayilar = " ";

        boolean asalMi = false;

        System.out.print("Dizinin eleman sayısını giriniz: "); // kullanıcıya soru soruyoruz.
        int diziUzunluk = scan.nextInt(); // dizinin uzunluğunu belirliyoruz.
        scan.nextLine(); // int veri girildikten sonra enter için girilen değeri yakalama.

        int[] sayilar = new int[diziUzunluk]; // sayilar dizisinin uzunluğu kullanıcının girdiği diziUzunluk bilgisi ile belirleniyor.

        // Bu döngüde kullanıcıdan girdiği eleman sayısının indexlerini alıyoruz.
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("Dizinin " + i + ". indexini giriniz: "); // kullanıcıdan indexleri belirlemesini istiyoruz.
            sayilar[i] = scan.nextInt(); // sayilar dizisi için i sayısının girilen indexini alıyoruz.
            scan.nextLine(); // int veri girildikten sonra enter için girilen değeri yakalama.
        }

        for (int sayi: sayilar) {
            for (int j = 2; j < sayi; j++) {
                if (sayi % j == 0){
                    asalOlmayanToplam += 1;
                    asalOlmayanSayilar += String.valueOf(sayi) + " ";
                    asalMi = false;
                    break;
                } else {
                    asalMi = true;
                }
            }

            if (asalMi){
                asalToplam += 1;
                asalSayilar += String.valueOf(sayi) + " ";
                asalMi = false;
            }
        }

        System.out.println("ASAL BİLGİLERİNİZ: ");
        System.out.println("Asal toplam: " + asalToplam + " Asal sayılar: " + asalSayilar);
        System.out.println("##############################################################");

        System.out.println("ASAL OLMAYAN BİLGİLERİNİZ: ");
        System.out.println("Asal olmayan toplam: " + asalOlmayanToplam + " Asal olmayan sayılar: " + asalOlmayanSayilar);

    }
}
