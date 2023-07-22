package Beginner.B01;

import java.util.Scanner;

public class LoginApp {

    static  boolean aktif = true;
    static  int kalanHakSayisi = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        if (aktif){
            if (kalanHakSayisi > 0){
                while (aktif){
                    System.out.print("Kullanici adiniz: ");
                    String username = scanner.nextLine();
                    System.out.print("Şifreniz: ");
                    String password = scanner.nextLine();
                    boolean sonuc = login(username , password);
                    if (sonuc){
                        System.out.println("Uygulama başarılı olarak giriş yaptınız");
                        break;
                    } else {
                        if (kalanHakSayisi == 0){
                            aktif=false;
                            break;
                        }
                        System.out.println("Kalan hakkınız: " + kalanHakSayisi);
                    }
                }
                if (!aktif){
                    System.out.println("Hak sayınız dolmuştur.");
                }
            } else {
                System.out.println("Hak sayınız dolmuştur, hesabınız bloke oldu!");
            }
        } else {
            System.out.println("Hesabınız aktif değildir, yöneticiniz ile iletişime geçiniz!");
        }
    }

    public static boolean login (String username, String password){
        if (username.equals("Vitalik") && password.equals("ETH123")){
            return true;
        } else {
            kalanHakSayisi--;
            System.out.println("Kullanıcı adı ve şifreniz yanlıştır.");
            return false;
        }
    }
}
