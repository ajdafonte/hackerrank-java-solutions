package pt.caires.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaList {

    public static void main(final String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            JavaList javaList = new JavaList();
            List<Integer> dataSource = javaList.performOperationsIn(sc, javaList.initializeDataSource(sc));
            dataSource.forEach(element -> System.out.print(element + " "));
        }
    }

    public List<Integer> initializeDataSource(Scanner sc) {
        List<Integer> dataSource = new ArrayList<>();
        int numElements = sc.nextInt();
        for (int i = 0; i < numElements; i++) {
            dataSource.add(sc.nextInt());
        }
        return dataSource;
    }

    public List<Integer> performOperationsIn(Scanner sc, List<Integer> dataSource) {
        int numOperations = sc.nextInt();
        for (int i = 0; i < numOperations; i++) {
            String operation = sc.next();
            if (operation.equals("Insert")) {
                int index = sc.nextInt();
                int newValue = sc.nextInt();
                dataSource.add(index, newValue);
            } else if (operation.equals("Delete")) {
                int index = sc.nextInt();
                dataSource.remove(index);
            }
        }
        return dataSource;
    }

}
