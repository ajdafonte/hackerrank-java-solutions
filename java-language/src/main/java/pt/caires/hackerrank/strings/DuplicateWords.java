package pt.caires.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DuplicateWords {

    public static void main(final String[] args) {

        final String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        final Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        final Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            final Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }

}
