package pt.caires.hackerrank.datastructures;

import java.util.Scanner;


public class OneDimensionArrayPart2 {

    private static boolean isSolvable(final int m, final int[] arr, final int i) {
        if (i < 0 || arr[i] == 1) {
            return false;
        }
        if ((i == arr.length - 1) || i + m > arr.length - 1) {
            return true;
        }

        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }

    public static boolean canWin(final int leap, final int[] game) {
        return isSolvable(leap, game, 0);
    }

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            final int n = scan.nextInt();
            final int leap = scan.nextInt();

            final int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

}
