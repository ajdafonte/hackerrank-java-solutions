package pt.caires.hackerrank.strings;

import java.util.Scanner;

public class Regex {
    // IP address is a string in the form "A.B.C.D",
    // where the value of A, B, C, and D may range from 0 to 255.
    // Leading zeros are allowed.
    // The length of A, B, C, or D can't be greater than 3.

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            final String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    static class MyRegex {

        // public String pattern = "(" + zeroTo255 + "\\.){3}" + zeroTo255; -- other option
        public static final String pattern = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";

        private MyRegex() {
            // NOOP
        }

    }

}
