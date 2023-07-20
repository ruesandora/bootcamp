package Beginner.B01;

public class Arrays_01 {
    public static void main(String[] args) {

        int[] sayilar = new int[4];
        sayilar[0] = 5;
        sayilar[1] = 10;
        sayilar[2] = 15;
        sayilar[3] = 20;

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println(sayilar[i]);
        }

        System.out.println("#####################");

        char[] karakterler = {'r' , 'u' , 'e' , 's' , 'a' , 'n' , 'd' , 'o' , 'r' , 'a'};
        for (int i = 0; i < karakterler.length; i++) {
            System.out.print(karakterler[i]);
        }

        System.out.println();
        System.out.println("#####################");

        double[] doubles = {10.1 , 10.2 , 10.3};
        for (int i = 0; i < doubles.length ; i++) {
            System.out.println(doubles[i] * doubles[i]);
        }


    }
}
