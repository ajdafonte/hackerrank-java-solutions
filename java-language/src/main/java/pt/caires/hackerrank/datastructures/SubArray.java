package pt.caires.hackerrank.datastructures;

import java.util.Arrays;
import java.util.Scanner;


public class SubArray {

    static int getNumOfNegativeSubarrays(final int[] arr) {
        int result = 0;

        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i <= arr.length; i++) {
                final int[] subarray = Arrays.copyOfRange(arr, j, i);
                if (isSumNegative(subarray)) {
                    result++;
                }
            }
        }
        return result;
    }

    private static boolean isSumNegative(final int[] arr) {
        return Arrays.stream(arr).sum() < 0;
    }

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final int n = sc.nextInt();
            final int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(getNumOfNegativeSubarrays(a));
        }
    }

}
