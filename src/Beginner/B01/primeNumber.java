package Beginner.B01;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*******************ASAL SAYI HESAPLAMA PROGRAMINA HOŞ GELDİNİZ*******************");
        System.out.print("Lütfen hesaplanmasını istediğiniz sayıyı giriniz: ");
        int input = scan.nextInt();
        boolean asalMi = false;

        for (int i = 2; i < input; i++) {
            if (input % i == 0){
                asalMi = false;
                break;
            } else {
                asalMi = true;
            }
        }

        if (asalMi){
            System.out.println("Girilen " + input + " sayisi asaldır..");
        } else {
            System.out.println("Girilen " + input + " sayisi asal değildir..");
        }
    }
}
