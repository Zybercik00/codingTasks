package hackerrank;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class JavaDatatypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {

            try {
                long value = sc.nextLong();
                System.out.println(value + " can be fitted in: ");

                if (value >= Long.MIN_VALUE && value <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
                if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
//                if (value < Long.MIN_VALUE && value > Long.MAX_VALUE) {
//                    System.out.println(value + " can't be fitted anywhere.");
//                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + " can't be fitted anywhere.");
            }
        }
    }
}
