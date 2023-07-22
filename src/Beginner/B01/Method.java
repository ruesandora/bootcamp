package Beginner.B01;

public class Method {
    public static void main(String[] args) {

         isimYazdir();
         topla(957,312);
         isimVeSoyisim("Vitalik" , "Uniswapoğlu");

        int methottanGelenSonuc = carp(5,3);
        String donenDeger = isimDondur("Enes");

    }

    public static String isimDondur(String isim){
        return isim;
    }

    public static int carp(int num1, int num2){
        int sonuc = num1*num2;
        return sonuc;
    }

    public static void isimVeSoyisim(String isim, String soyisim){

        System.out.println();
        System.out.println("İsminiz: " + isim);
        System.out.println("Soyisminiz: " + soyisim);
        System.out.println("İsim ve Soyisim: " + isim.concat(" " + soyisim));
    }

    public static void topla(int num1, int num2){
        System.out.println();
        System.out.println("Sayıların toplamı: " + (num1 + num2));
    }
    public static void isimYazdir(){
        System.out.println("Vitalik");
    }
}
