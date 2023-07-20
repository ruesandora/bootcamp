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

        for (int sayi: sayilar) { // sayilar arrayinde ki tüm sayıların uzunluğunu sayi variable'ına atar
            for (int j = 2; j < sayi; j++) { // j ==> 2'den başlar sayi'ya kadar.
                if (sayi % j == 0){ // sayi % j bölümü 0'ı buluyorsa bunun asal olmadığını belirleyen bir döngü.
                    asalOlmayanToplam += 1; // asal olmayan kaç sayı varsa girilir.
                    asalOlmayanSayilar += String.valueOf(sayi) + " "; // asal olmayan tüm sayılar yazdırılır.
                    asalMi = false; // asal olmadığını belirten false flagı
                    break; // for döngüsünü kırmak için. (asalsa yazdırıp değerler girilecek, değilse else bloğuna geçilir.)
                } else {
                    asalMi = true; // yukarıda ki sayı asal ise else bloğuna geçilir ve flagı true'ya çevirir.
                }
            }

            if (asalMi){ // flag'ın true'ya çevrilmesi durumunda çalışacak koşul
                asalToplam += 1; // asal olan kaç sayı varsa girilir.
                asalSayilar += String.valueOf(sayi) + " "; // asal olan tüm sayılar yazdırılır.
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
