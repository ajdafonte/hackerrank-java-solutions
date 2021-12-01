package pt.caires.hackerrank.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.Collections.emptyList;


public class StringTokens {

    private static final int TEXT_MIN_SIZE = 1;
    private static final double TEXT_MAX_SIZE = 4 * Math.pow(10, 5);
    private static final String STR_REGEX = "[A-Za-z !,?._'@]+";
    private static final String TOKEN_REGEX = "[^A-Za-z]+";

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final String s = scan.nextLine();
        StringTokens stringTokens = new StringTokens();
        List<String> words = stringTokens.getWordsIn(s);
        System.out.println(words.size());
        words.forEach(System.out::println);
        scan.close();
    }

    public List<String> getWordsIn(String text) {
        if (Pattern.matches(STR_REGEX, text)) {
            String trimmedText = text.trim();
            int trimmedTextSize = trimmedText.length();
            if (trimmedTextSize >= TEXT_MIN_SIZE && trimmedTextSize <= TEXT_MAX_SIZE) {
                return Arrays.asList(trimmedText.split(TOKEN_REGEX));
            }
        }

        return emptyList();
    }

}