package pt.caires.hackerrank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class JumpingClouds {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(final int[] c) {
        int numJumps = 0;
        for (int i = 0; i < c.length - 1; ) {
            final int bestJump = i + 2;
            if (bestJump < c.length && c[bestJump] == 0) {
                i = i + 2;
            } else {
                i++;
            }
            numJumps++;
        }
        return numJumps;
    }

    public static void main(final String[] args) throws IOException {
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int[] c = new int[n];

        final String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            final int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        final int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
