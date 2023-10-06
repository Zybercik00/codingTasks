package hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int line_num = 0;
        while(sc.hasNext())
            System.out.println(++line_num + " " + sc.nextLine());
        sc.close();

    }


}
