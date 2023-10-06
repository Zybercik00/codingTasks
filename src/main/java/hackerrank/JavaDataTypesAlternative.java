package hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaDataTypesAlternative {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {

            try {
                System.out.println(a + " can be fitted in:");
                short value = sc.nextShort();
                System.out.println("* short");
                continue;
            } catch (InputMismatchException e) {

            }
            try {
                System.out.println(a + " can be fitted in:");
                int value = sc.nextInt();
                System.out.println("* int");
                continue;
            } catch (InputMismatchException e) {

            }
            try {
                System.out.println(a + " can be fitted in:");
                long value = sc.nextLong();
                System.out.println("* long");
                continue;
            } catch (InputMismatchException e) {

            }
            System.out.println(a + " can't be fitted anywhere.");
        }
    }
}


