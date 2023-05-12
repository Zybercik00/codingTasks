package hackerrank;

import java.util.Scanner;

public class JavaLoop2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();



            int pow = 0;
            int currentTerm = (int) (a + pow * b);
            for (int j = 0; j < n; j++) {
                int powResult = (int) Math.pow(2, pow++);
                currentTerm += (int) powResult * b;
                System.out.print(currentTerm + " ");
            }
            System.out.println();

        }

    }
}

