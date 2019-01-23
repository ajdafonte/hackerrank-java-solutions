package pt.caires.hackerrank;

import java.util.Scanner;


/**
 *
 */
public class Solution2
{
    private static void solve(final double meal_cost, final int tip_percent, final int tax_percent)
    {
        final double tip = meal_cost * (tip_percent / 100.0);
        final double tax = meal_cost * (tax_percent / 100.0);
        final double totalCost = meal_cost + tip + tax;
        System.out.println(Math.round(totalCost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args)
    {
        final double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
