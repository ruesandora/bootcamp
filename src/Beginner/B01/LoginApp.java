package Beginner.B01;

import java.util.Scanner;

public class LoginApp {

    static  boolean aktif = true; // değişkeni main dışına atadım method içersinde kullanabilmek için.
    static  int kalanHakSayisi = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Kullanicidan bir girdi almak için.

        if (aktif){ // Eğer aktif == true ise
            if (kalanHakSayisi > 0){ // Eğer kalanHakSayisi > 0 ise
                while (aktif){ // while döngüsü çalışır aynı zamanda aktif == true ise
                    System.out.print("Kullanici adiniz: "); // Kullanici adini girer.
                    String username = scanner.nextLine(); // girilen ad username'e atanır
                    System.out.print("Şifreniz: "); // Kullanici şifresini girer.
                    String password = scanner.nextLine(); // girilen şifre password'a atanır
                    boolean sonuc = login(username , password); // login method'u sonuc'a atanır.
                    if (sonuc){ // sonuc metodunun return type'ı true ise
                        System.out.println("Uygulama başarılı olarak giriş yaptınız"); // kullanıcı başarılı bir şekilde giriş yapar.
                        break; // döngü kırılır ve döngü tekrar etmez.
                    } else { // sonuc metodunun return type'ı false ise
                        if (kalanHakSayisi == 0){ // kalanHakSayisi == 0'a eşit ise
                            aktif=false; // aktiflik false olur
                            break; // döngü kırılır
                        }
                        System.out.println("Kalan hakkınız: " + kalanHakSayisi); // Kullanıcı her yanlış giriş yaptığında kalan hak ekrana yazdırılır.
                    }
                }
                if (!aktif){ // aktif false ise
                    System.out.println("Hak sayınız dolmuştur."); // yazdırılır
                }
            } else { // kalanHakSayisi 0'dan büyük değilse
                System.out.println("Hak sayınız dolmuştur, hesabınız bloke oldu!"); // yazdirilir
            }
        } else { // aktif == true değilse
            System.out.println("Hesabınız aktif değildir, yöneticiniz ile iletişime geçiniz!"); // yazdirilir
        }
    }

    public static boolean login (String username, String password){ // bu call bize true veya false döndürür.
        if (username.equals("Vitalik") && password.equals("ETH123")){ // Kullanıcı adı Vitalik, şifre ETH123 ise return true döndürür.
            return true; // return true döndürür.
        } else { // değilse
            kalanHakSayisi--; // kalanHakSayisisi 1 azalır
            System.out.println("Kullanıcı adı ve şifreniz yanlıştır."); // yazdırılır
            return false; // return false döndürür.
        }
    }
}
