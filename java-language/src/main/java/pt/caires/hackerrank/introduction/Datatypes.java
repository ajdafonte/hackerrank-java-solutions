package pt.caires.hackerrank.introduction;

import java.util.Scanner;


// TODO: 02/12/2021 - Refactor approach
public class Datatypes {

    private static boolean checkNumberType(final Number num,
                                           final String intType,
                                           final Number minValue,
                                           final Number maxValue) {
        if (checkRangeInclusive(num.longValue(), minValue.longValue(), maxValue.longValue())) {
            System.out.println("* " + intType);
            return true;
        }

        return false;
    }

    private static void checkIntegerType(final long num) {
        final boolean isByte =
                checkNumberType(num, Byte.TYPE.getTypeName().toLowerCase(), Byte.MIN_VALUE, Byte.MAX_VALUE);
        final boolean isShort =
                checkNumberType(num, Short.TYPE.getTypeName().toLowerCase(), Short.MIN_VALUE, Short.MAX_VALUE);
        final boolean isInt =
                checkNumberType(num, Integer.TYPE.getTypeName().toLowerCase(), Integer.MIN_VALUE, Integer.MAX_VALUE);
        final boolean isLong =
                checkNumberType(num, Long.TYPE.getTypeName().toLowerCase(), Long.MIN_VALUE, Long.MAX_VALUE);
        if (!(isByte || isShort || isInt || isLong)) {
            System.out.println(num + " can 't be fitted anywhere.");
        }
    }

    private static boolean checkRangeInclusive(final long num, final long min, final long max) {
        return min <= num && num <= max;
    }

    public static void main(final String[] argh) {

        final Scanner sc = new Scanner(System.in);
        final int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                final long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                checkIntegerType(x);
            } catch (final Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }

    }

}
