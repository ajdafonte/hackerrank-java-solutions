package pt.caires.hackerrank.strings;

import java.util.Scanner;


public class SubstringComparisons {

    public static String getSmallestAndLargest(final String s, final int k) {
        String currentSequence = s.substring(0, k);
        String smallest = currentSequence;
        String largest = currentSequence;
        for (int i = 1; i <= s.length() - k; i++) {
            currentSequence = s.substring(i, i + k);
            if (currentSequence.compareTo(smallest) < 0) {
                smallest = currentSequence;
            }
            if (currentSequence.compareTo(largest) > 0) {
                largest = currentSequence;
            }
        }
        return smallest + "\n" + largest;

        // Remarks: Another valid approach
//        TreeSet<String> sequences = new TreeSet<>();
//        for (int i = 0; i <= s.length() - k; i++) {
//            String sequence = s.substring(i, i + k);
//            sequences.add(sequence);
//        }
//        return sequences.first() + "\n" + sequences.last();
    }


    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final String s = scan.next();
        final int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
