package pt.caires.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class JavaArraylist {

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            JavaArraylist javaArraylist = new JavaArraylist();
            List<List<Integer>> dataSource = javaArraylist.initializeDataSource(sc);

            int numQueries = sc.nextInt();
            for (int i = 0; i < numQueries; i++) {
                int line = sc.nextInt();
                int position = sc.nextInt();
                Optional<Integer> numberFound =
                        javaArraylist.findNumberIn(dataSource, line - 1, position - 1);
                if (numberFound.isPresent()) {
                    System.out.println(numberFound.get());
                } else {
                    System.out.println("ERROR!");
                }
            }
        }
    }

    public List<List<Integer>> initializeDataSource(Scanner sc) {
        int numLines = sc.nextInt();
        List<List<Integer>> dataSource = new ArrayList<>(numLines);
        for (int i = 0; i < numLines; i++) {
            int numItems = sc.nextInt();
            List<Integer> line = new ArrayList<>(numItems);
            for (int j = 0; j < numItems; j++) {
                line.add(sc.nextInt());
            }
            dataSource.add(line);
        }
        return dataSource;
    }

    public Optional<Integer> findNumberIn(List<List<Integer>> dataSource, int line, int position) {
        try {
            return Optional.of(dataSource.get(line).get(position));
        } catch (IndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }

}
