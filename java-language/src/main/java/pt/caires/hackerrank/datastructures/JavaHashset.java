package pt.caires.hackerrank.datastructures;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class JavaHashset {

    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);
        final int t = s.nextInt();
        final String[] pairLeft = new String[t];
        final String[] pairRight = new String[t];

        for (int i = 0; i < t; i++) {
            pairLeft[i] = s.next();
            pairRight[i] = s.next();
        }

        printUniquePairs(t, pairLeft, pairRight);
    }

    public static void printUniquePairs(int numPairs, String[] leftPairValues, String[] rightPairValues) {
        Set<SimpleImmutableEntry<String, String>> pairs = new HashSet<>();
        for (int i = 0; i < numPairs; i++) {
            pairs.add(new SimpleImmutableEntry<>(leftPairValues[i], rightPairValues[i]));
            System.out.println(pairs.size());
        }
    }

}
