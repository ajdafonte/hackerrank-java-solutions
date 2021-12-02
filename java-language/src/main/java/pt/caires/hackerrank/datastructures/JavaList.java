package pt.caires.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Scanner;


// TODO: 02/12/2021 Refactor approach
public class JavaList {

    private static ArrayList<Integer> list;

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            populateList(sc);
            performQueries(sc);
            list.forEach(elem -> System.out.print(elem + " "));
        }
    }

    private static void performQueries(final Scanner sc) {
        final int numQueries = sc.nextInt();
        for (int i = 0; i < numQueries; i++) {
            final String queryType = sc.next();
            switch (queryType) {
                case "Insert": {
                    final int insertX = sc.nextInt();
                    final int insertY = sc.nextInt();
                    list.add(insertX, insertY);
                    break;
                }
                case "Delete": {
                    final int deleteX = sc.nextInt();
                    list.remove(deleteX);
                    break;
                }
            }
        }
    }

    private static void populateList(final Scanner sc) {
        final int n = sc.nextInt();
        list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
    }

}
