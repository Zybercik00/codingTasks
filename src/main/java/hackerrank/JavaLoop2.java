package hackerrank;

import java.util.Scanner;

public class JavaLoop2 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int pow = 0;

    int currentTerm = (int) (a + Math.pow(2, pow) * b);
            for (int i = 0; i < n; i++) {
        currentTerm += (int) Math.pow(2, pow++) * b;
        System.out.print(currentTerm + " ");
    }
            System.out.println();
            scanner.close();
}

}
