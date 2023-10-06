package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaDatatypes {

    private static final BigInteger SHORT_MIN_VALUE = BigInteger.valueOf(Short.MIN_VALUE);
    private static final BigInteger SHORT_MAX_VALUE = BigInteger.valueOf(Short.MAX_VALUE);
    private static final BigInteger BYTE_MIN_VALUE = BigInteger.valueOf(Byte.MIN_VALUE);
    private static final BigInteger BYTE_MAX_VALUE = BigInteger.valueOf(Byte.MAX_VALUE);
    private static final BigInteger INTEGER_MIN_VALUE = BigInteger.valueOf(Integer.MIN_VALUE);
    private static final BigInteger INTEGER_MAX_VALUE = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger LONG_MIN_VALUE = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger LONG_MAX_VALUE = BigInteger.valueOf(Long.MAX_VALUE);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int howManyValues = sc.nextInt();

        for (int i = 0; i < howManyValues; i++) {

            BigInteger value = sc.nextBigInteger();

            if (isNot(value)) {
                System.out.println(value + " can't be fitted anywhere.");
            } else {

                System.out.println(value + " can be fitted in: ");

                if (isShort(value)) {
                    System.out.println("* short");
                }

                if (isByte(value)) {
                    System.out.println("* byte");
                }

                if (isInteger(value)) {
                    System.out.println("* int");
                }

                if (isLong(value)) {
                    System.out.println("* Long");
                }
            }

        }
    }

    private static boolean isShort(BigInteger number) {
        if (number.compareTo(SHORT_MIN_VALUE) < 0) {
            return false;
        }
        return number.compareTo(SHORT_MAX_VALUE) <= 0;
    }
    private static boolean isByte(BigInteger number) {
        if (number.compareTo(BYTE_MIN_VALUE) < 0) {
            return false;
        }
        return number.compareTo(BYTE_MAX_VALUE) <= 0;
    }

    private static boolean isInteger(BigInteger number) {
        if (number.compareTo(INTEGER_MIN_VALUE) < 0) {
            return false;
        }
        return number.compareTo(INTEGER_MAX_VALUE) <= 0;
    }

    private static boolean isLong(BigInteger number) {
        if (number.compareTo(LONG_MIN_VALUE) < 0) {
            return false;
        }
        return number.compareTo(LONG_MAX_VALUE) <= 0;
    }

    private static boolean isNot(BigInteger number) {
        if (number.compareTo(LONG_MIN_VALUE) < 0) {
            return true;
        }
        return number.compareTo(LONG_MAX_VALUE) >= 0;
    }

}
