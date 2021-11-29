package pt.caires.hackerrank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class SockMerchant {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the sockMerchant function below.
    static int sockMerchant(final int n, final int[] ar) {
        // version 1
//        final HashMap<Integer, Long> map = new HashMap();
//        Arrays.stream(ar)
//            .distinct()
//            .forEach(num -> {
//                map.put(num, Arrays.stream(ar).filter(x -> x == num).count() / 2);
//            });
//
//        return map.values().stream().mapToInt(x -> x.intValue()).reduce(Integer::sum).getAsInt();

        // version 2
        final HashSet<Integer> socks = new HashSet<>();
        int numPairs = 0;
        for (int i = 0; i < n; i++) {
            if (!socks.contains(ar[i])) {
                socks.add(ar[i]);
            } else {
                socks.remove(ar[i]);
                numPairs++;
            }
        }

        return numPairs;
    }

    public static void main(final String[] args) throws IOException {
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int[] ar = new int[n];

        final String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            final int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        final long start = System.nanoTime();
        final int result = sockMerchant(n, ar);
        final long elapsedTime = System.nanoTime() - start;
        System.out.println(elapsedTime);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
