package pt.caires.hackerrank.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class LeftRotation {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the rotLeft function below.
    static int[] rotLeft(final int[] a, final int d) {
        final List<Integer> integers = Arrays.stream(a).boxed().collect(Collectors.toList());

        Collections.rotate(integers, -d);

        return integers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(final String[] args) throws IOException {
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final String[] nd = scanner.nextLine().split(" ");

        final int n = Integer.parseInt(nd[0]);

        final int d = Integer.parseInt(nd[1]);

        final int[] a = new int[n];

        final String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            final int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        final int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
