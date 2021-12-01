package pt.caires.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Solution8 {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            final String name = in.next();
            final int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            final String s = in.next();
            // Write code here
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
