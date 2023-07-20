package Beginner.B01;

public class Foreach {
    public static void main(String[] args) {

        String[] isimler = {"Ahmet" , "Mehmet" , "Sefa" , "Cordoba"};
        for (String eleman : isimler) {
            System.out.println(eleman);
        }

        System.out.println("###########");

        int[] rakamlar = {0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
        for (int rakam: rakamlar){
            System.out.print(rakam + " ");
        }
    }
}
