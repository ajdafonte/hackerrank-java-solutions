package pt.caires.hackerrank.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 */
public class CurrencyFormatter
{
    public static void main(final String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        final double payment = scanner.nextDouble();
        scanner.close();

        final Locale indiaLoc = new Locale("en", "IN");
        final String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        final String india = NumberFormat.getCurrencyInstance(indiaLoc).format(payment);
        final String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        final String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
