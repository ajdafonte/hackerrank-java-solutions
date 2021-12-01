package pt.caires.hackerrank;

import java.util.Scanner;


public class Solution0 {

    public static void main(final String[] args) {
        // Create a Scanner object to read input from stdin.
        final Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        final String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        // Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
    }

}
