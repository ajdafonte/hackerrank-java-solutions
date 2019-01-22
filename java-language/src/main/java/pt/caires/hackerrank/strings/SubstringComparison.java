package pt.caires.hackerrank.strings;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.IntStream;


/**
 * Created by aleja on 28/12/2018.
 */
public class SubstringComparison
{
    private static int getEndIdx(final String s, final int k, final int idx)
    {
        final int nextIdx = idx + k;
        return (nextIdx > s.length()) ? s.length() : nextIdx;
    }

    private static boolean validate(final String s, final int k)
    {
        return s.length() >= k && k > 0;
    }

    public static String getSmallestAndLargest(final String s, final int k)
    {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        // get all the possible substrings (considering k) - k doesn't has constraint (can be negative, zero, normal or bigger than length of S)
        if (validate(s, k))
        {
            // sort the array of possible substrings (lexicographically) -- treeset sort the elements automatically
            final TreeSet<String> substrings = new TreeSet<>();
            IntStream.range(0, k).forEach(num -> {
//                System.out.println("Iter " + num);
                for (int i = num; i <= s.length() - k; i = i + k)
                {
                    final String s1 = s.substring(i, getEndIdx(s, k, i));
//                    System.out.println("String " + s1);
                    substrings.add(s1);
                }
            });
//            System.out.println(substrings);
            // get first and last of sorted array
            smallest = substrings.first();
            largest = substrings.last();
        }
        return smallest + "\n" + largest;
    }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);
        final String s = scan.next();
        final int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
