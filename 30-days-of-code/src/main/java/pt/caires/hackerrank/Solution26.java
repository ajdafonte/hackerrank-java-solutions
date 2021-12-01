package pt.caires.hackerrank;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Solution26 {

//    private static int calculateFine(final LocalDate returnDate, final LocalDate expectedDate)
//    {
//        // this is OK, but exercise is not fit for this
//        int fine = 0;
//
//        if (returnDate.isAfter(expectedDate))
//        {
//            // get period between dates
//            final Period p = Period.between(expectedDate, returnDate);
//            // check if month and year of expected date are the same
//            if (p.getMonths() == 0 && p.getYears() == 0)
//            {
//                // calculate diff of num days and multiply by 15
//                fine = p.getDays() * 15;
//            }
//            else if (p.getYears() == 0)
//            {
//                // calculate diff of num months and multiply by 500
//                fine = p.getMonths() * 500;
//            }
//            else
//            {
//                fine = 10000;
//            }
//        }
//        return fine;
//    }

    private static int calculateFine(final String returnDateStr, final String expectedDateStr) {
        int fine = 0;

        try {
            final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d M yyyy");
            final LocalDate returnDate = LocalDate.parse(returnDateStr, dtf);
            final LocalDate expectedDate = LocalDate.parse(expectedDateStr, dtf);

            if (returnDate.isAfter(expectedDate)) {
                // get period between dates
                final Period p = Period.between(expectedDate, returnDate);

                if (returnDate.getYear() != expectedDate.getYear()) {
                    fine = 10000;
                } else if (p.getMonths() == 0) {
                    // calculate diff of num days and multiply by 15
                    fine = p.getDays() * 15;
                } else {
                    // calculate diff of num months and multiply by 500
                    fine = p.getMonths() * 500;
                }
            }
        } catch (final DateTimeParseException e) {
            fine = 0;
        }

        return fine;
    }

    public static void main(final String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        try (final Scanner sc = new Scanner(System.in)) {
            final String returnDateStr = sc.nextLine();
            final String expectedDateStr = sc.nextLine();
            System.out.println(calculateFine(returnDateStr, expectedDateStr));
        }
    }

}
