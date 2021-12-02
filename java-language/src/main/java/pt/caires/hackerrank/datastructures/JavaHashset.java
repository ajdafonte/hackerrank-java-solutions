package pt.caires.hackerrank.datastructures;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


// TODO: 02/12/2021 Refactor this approach
public class JavaHashset {

    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);
        final int t = s.nextInt();
        final String[] pair_left = new String[t];
        final String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        final Set<Pair<String, String>> pairSet = new HashSet<>();
        for (int i = 0; i < t; i++) {
            pairSet.add(new Pair<>(pair_left[i], pair_right[i]));
            System.out.println(pairSet.size());
        }
    }

}
