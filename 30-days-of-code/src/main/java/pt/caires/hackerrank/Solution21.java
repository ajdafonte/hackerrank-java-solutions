package pt.caires.hackerrank;

import java.util.Arrays;
import java.util.Scanner;


class Printer<T> {

    /**
     * Method Name: printArray Print each element of the generic array on a new line. Do not return anything.
     *
     * @param arr a generic array
     **/
    void printArray(final T[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

}


public class Solution21 {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        final String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        final Printer<Integer> intPrinter = new Printer<>();
        final Printer<String> stringPrinter = new Printer<>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }

}
