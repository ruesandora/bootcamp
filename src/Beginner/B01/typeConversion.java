package Beginner.B01;

public class typeConversion {
    public static void main(String[] args) {

        // I did type conversion of the String value in variable a to b
        String a = "5"; // String = 5
        int b = Integer.valueOf(a);
        System.out.println(b); // 5

        // I Stringified the int value in the ab variable.
        int ab = 21;
        String abc = String.valueOf(ab); // 21
        System.out.println(abc); // 21

        // I cast double to int.
        double d = 5;
        int dd = (int) d; // data casting ==> 5
        System.out.println(dd);

        // I cast int to double.
        int ii = 10;
        double id = (double) ii;
        System.out.println(id);

    }
}
