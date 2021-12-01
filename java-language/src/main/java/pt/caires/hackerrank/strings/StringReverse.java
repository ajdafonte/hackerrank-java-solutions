package pt.caires.hackerrank.strings;

import java.util.Scanner;


public class StringReverse {

    static boolean isPalindrome(final String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);
        final String A = sc.next();
        System.out.println(isPalindrome(A) ? "Yes" : "No");
    }

}
