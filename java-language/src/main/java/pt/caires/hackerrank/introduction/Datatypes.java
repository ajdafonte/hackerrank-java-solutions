package pt.caires.hackerrank.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Datatypes {

    public static void main(final String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                Datatypes datatypes = new Datatypes();
                datatypes.printSupportedDataTypes(datatypes.getSupportedDataTypesBy(x));
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }

    }

    public List<Class<? extends Number>> getSupportedDataTypesBy(long value) {
        List<Class<? extends Number>> supportedDataTypes = new ArrayList<>();
        if (isByteNumber(value)) {
            supportedDataTypes.add(Byte.TYPE);
        }
        if (isShortNumber(value)) {
            supportedDataTypes.add(Short.TYPE);
        }
        if (isIntNumber(value)) {
            supportedDataTypes.add(Integer.TYPE);
        }
        supportedDataTypes.add(Long.TYPE);
        return supportedDataTypes;
    }

    public void printSupportedDataTypes(List<? extends Class<? extends Number>> supportedDataTypes) {
        supportedDataTypes.forEach(supportedDataType -> System.out.println("* " + supportedDataType.toString()));
    }

    private boolean checkInclusiveRangeOf(long value, long min, long max) {
        return value >= min && value <= max;
    }

    private boolean isByteNumber(long value) {
        return checkInclusiveRangeOf(value, Byte.MIN_VALUE, Byte.MAX_VALUE);
    }

    private boolean isShortNumber(long value) {
        return checkInclusiveRangeOf(value, Short.MIN_VALUE, Short.MAX_VALUE);
    }

    private boolean isIntNumber(long value) {
        return checkInclusiveRangeOf(value, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}
