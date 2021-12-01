package pt.caires.hackerrank.oo_programming;

import javafx.util.Pair;

import java.util.Arrays;


class Arithmetic {

    int add(final int value1, final int value2) {
        return value1 + value2;
    }

}

class Adder extends Arithmetic {

}

public class Inheritance2 {

    public static void main(final String[] args) {
        printPairs(new Arithmetic());
        printPairs(new Adder());
    }

    private static void printPairs(final Arithmetic arithmetic) {
        final Pair<Integer, Integer>[] pairs = new Pair[]{new Pair<>(20, 22), new Pair<>(5, 8), new Pair<>(10, 10)};
        System.out.println("My superclass is: " + arithmetic.getClass().getSimpleName());
        Arrays.stream(pairs).forEach(p -> System.out.print(arithmetic.add(p.getKey(), p.getValue()) + " "));
        System.out.println();
    }

}
