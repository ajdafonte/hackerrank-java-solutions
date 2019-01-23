package pt.caires.hackerrank.strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;


/**
 *
 */
public class Anagrams
{
    private static HashMap<Character, Long> createAnagramTable(final String str)
    {
        final HashMap<Character, Long> table = new HashMap<>();
        final IntStream uniqueChars = str.toLowerCase().chars().distinct();
        uniqueChars.forEach(x -> table.put((char) x, str.toLowerCase().chars().filter(i -> i == x).count()));
        return table;
    }

    private static boolean isAnagram(final String a, final String b)
    {
        return createAnagramTable(a).equals(createAnagramTable(b));
    }

    public static void main(final String[] args)
    {

        final Scanner scan = new Scanner(System.in);
        final String a = scan.next();
        final String b = scan.next();
        scan.close();
        final boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
