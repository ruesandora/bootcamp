package Beginner.B02;

public class OOP {
    public static void main(String[] args) {

        Obje ogrenci1 = new Obje();

        ogrenci1.id = 10;
        ogrenci1.isim = "Vitalik";
        ogrenci1.soyisim = "Buterin";

        System.out.println("Öğrenci ID'si: " + ogrenci1.id);
        System.out.println("Öğrenci ismi: " + ogrenci1.isim);
        System.out.println("Öğrenci soyismi: " + ogrenci1.soyisim);
    }
}
