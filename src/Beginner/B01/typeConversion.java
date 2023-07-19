package Beginner.B01;

public class typeConversion {
    public static void main(String[] args) {
        String a = "5"; // String = 5

        // I did type conversion of the String value in variable a to b
        int b = Integer.valueOf(a);
        System.out.println(b); // 5

        // I Stringified the int value in the ab variable.
        int ab = 21;
        String abc = String.valueOf(ab); // 21
        System.out.println(abc); // 21


    }
}
