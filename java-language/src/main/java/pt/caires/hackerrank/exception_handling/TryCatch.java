package pt.caires.hackerrank.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;


// TODO: 02/12/2021 Add unit test
public class TryCatch {

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final String x = sc.next();
            final String y = sc.next();

            System.out.println(specialDivision(x, y));
        } catch (final ArithmeticException | InputMismatchException e) {
            System.out.println(e.toString());
        }
    }

    private static Long specialDivision(final String x, final String y)
            throws ArithmeticException, InputMismatchException {
        final Long numX = convertToLong(x);
        final Long numY = convertToLong(y);
        if (is32BitSigned(numX) && is32BitSigned(numY)) {
            if (numY == 0) {
                throw new ArithmeticException("/ by zero");
            }
        } else {
            throw new InputMismatchException();
        }

        return numX / numY;
    }

    private static Long convertToLong(final String x) throws InputMismatchException {
        try {
            return Long.valueOf(x);
        } catch (final NumberFormatException e) {
            throw new InputMismatchException();
        }

    }

    private static boolean is32BitSigned(final Long x) {
        return x >= 0 && x < Integer.MAX_VALUE;
    }

}
