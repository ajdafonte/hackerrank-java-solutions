package pt.caires.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 */
public class Solution28
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args)
    {
        final int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final ArrayList<String> names = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++)
        {
            final String[] firstNameEmailID = scanner.nextLine().split(" ");

            final String firstName = firstNameEmailID[0];

            final String emailID = firstNameEmailID[1];

            // if emailId end with @gmail.com name should be stored
            final String myRegExString = "[a-z]*@gmail\\.com";

            // Create a Pattern object (compiled RegEx) and save it as 'p'
            final Pattern p = Pattern.compile(myRegExString);

            // We need a Matcher to match our compiled RegEx to a String
            final Matcher m = p.matcher(emailID);

            // if our Matcher finds a match
            if (m.find())
            {
                // add to list of arrays
                names.add(firstName);
            }
        }

        names.stream()
            .sorted()
            .forEach(System.out::println);

        scanner.close();
    }
}
