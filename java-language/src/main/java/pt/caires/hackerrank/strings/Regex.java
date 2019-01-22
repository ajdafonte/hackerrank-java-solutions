package pt.caires.hackerrank.strings;

import java.util.Scanner;


class Regex
{
    // IP address is a string in the form "A.B.C.D",
    // where the value of A, B, C, and D may range from 0 to 255.
    // Leading zeros are allowed.
    // The length of A, B, C, or D can't be greater than 3.

    // Valid IPs
//    000.12.12.034
//        121.234.12.12
//        23.45.12.56

    // Invalid IPs
//        000.12.234.23.23
//        666.666.23.23
//        .213.123.23.32
//        23.45.22.32.
//    I.Am.not.an.ip

    public static void main(final String[] args)
    {
        final Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            final String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    static class MyRegex
    {
        //        public String pattern = "(" + zeroTo255 + "\\.){3}" + zeroTo255;
        public static final String pattern = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
    }
}
