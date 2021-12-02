package pt.caires.hackerrank.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class CurrencyFormatter {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double payment = scanner.nextDouble();
        scanner.close();

        CurrencyFormatter currencyFormatter = new CurrencyFormatter();
        String us = currencyFormatter.getPaymentFormattedIn(payment, Locale.US);
        String india = currencyFormatter.getPaymentFormattedIn(payment, new Locale("en", "IN"));
        String china = currencyFormatter.getPaymentFormattedIn(payment, Locale.CHINA);
        String france = currencyFormatter.getPaymentFormattedIn(payment, Locale.FRANCE);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    public String getPaymentFormattedIn(double payment, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(payment);
    }

}
