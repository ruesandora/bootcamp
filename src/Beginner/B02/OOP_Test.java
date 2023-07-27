package Beginner.B02;

import java.util.Scanner;

public class OOP_Test {
  public static void main(String[] args) {

    // Calisan sınıfını olusturup ise baslayalım.

    System.out.println("************Uygulamaya Hoşgeldiniz************");

    Scanner scanner = new Scanner(System.in);
    System.out.print("No degerini giriniz: ");
    int no = scanner.nextInt();

    System.out.print("İsim degerini giriniz: ");
    String isim = scanner.nextLine();

    scanner.nextLine();

    System.out.print("Soyisim degerini giriniz: ");
    String soyisim = scanner.nextLine();

    System.out.print("Tecrübe degerini giriniz: ");
    int tecrube = scanner.nextInt();

    System.out.print("Maaş degerini giriniz: ");
    int maas = scanner.nextInt();

    Calisan calisan = new Calisan(no, isim, soyisim, tecrube, maas);

    String islemler = "1- Calısan biglieri göster\n" +
            "2- Zam yap\n" +
            "3- Format At";

    System.out.println("---------------------------------");
    System.out.println(islemler);
    System.out.print("Secim yapınız: ");
    int secim = scanner.nextInt();
    scanner.nextLine();

    switch (secim){
      case 1:
        calisan.calisanBilgileriGoster();
        break;

      default:
        break;
    }

  }
}
