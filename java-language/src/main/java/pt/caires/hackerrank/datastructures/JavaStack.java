package pt.caires.hackerrank.datastructures;

import java.util.Scanner;
import java.util.Stack;


public class JavaStack {

    private static final char[] START_DELIMITERS = {'(', '[', '{'};
    private static final char[] END_DELIMITERS = {')', ']', '}'};

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            final String input = sc.next();
            System.out.println(isBalanced(input));
        }

    }

    static Boolean isBalanced(final String input) {
        final Stack<Character> stackChars = new Stack<>();

        // some initial checks
        if (input.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
            final char currChar = input.charAt(i);
            if (isEndDelimiter(currChar) && stackChars.empty()) {
                return false;
            }

            if (isStartDelimiter(currChar)) {
                stackChars.push(currChar);
            } else if (isEndDelimiter(currChar)) {
                final char lastChar = stackChars.pop();
                if (!checkIfDelimitersMatches(lastChar, currChar)) {
                    return false;
                }
            }
        }

        return stackChars.empty();
    }

    private static boolean checkIfDelimitersMatches(final char startChar, final char endChar) {
        return (startChar == '(' && endChar == ')') ||
                (startChar == '[' && endChar == ']') ||
                (startChar == '{' && endChar == '}');
    }

    private static boolean isEndDelimiter(final char charDelimiter) {
        for (final char openDelimiter : END_DELIMITERS) {
            if (openDelimiter == charDelimiter) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStartDelimiter(final char charDelimiter) {
        for (final char openDelimiter : START_DELIMITERS) {
            if (openDelimiter == charDelimiter) {
                return true;
            }
        }
        return false;
    }

}
