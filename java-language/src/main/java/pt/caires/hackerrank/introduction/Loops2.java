package pt.caires.hackerrank.introduction;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Loops2 {

    private static int powInt(int a, int b) {
        return (int) Math.pow(a, b);
    }

    static int calculateSerie(int n, int a, int b) {
        if (n == 0) {
            return a + powInt(2, n) * b;
        } else {
            return calculateSerie(n - 1, a, b) + powInt(2, n) * b;
        }
    }

    static List<Integer> calculateCompleteSeries(int n, int a, int b) {
        return IntStream.range(0, n)
                .boxed()
                .map(iterationNumber -> calculateSerie(iterationNumber, a, b))
                .collect(Collectors.toList());
    }

    public static void main(final String[] argh) {
        final Scanner in = new Scanner(System.in);
        final int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            final int a = in.nextInt();
            final int b = in.nextInt();
            final int n = in.nextInt();
            calculateCompleteSeries(n, a, b).forEach(number -> System.out.print(number + " "));
            System.out.println();
        }
        in.close();
    }

}
