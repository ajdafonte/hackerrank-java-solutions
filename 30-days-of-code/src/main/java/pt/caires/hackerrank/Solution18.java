package pt.caires.hackerrank;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * Created by aleja on 23/01/2019.
 */
public class Solution18
{
    private final Queue q = new LinkedList<>();
    private final ArrayDeque s = new ArrayDeque<>();

    private void pushCharacter(final char ch)
    {
        s.push(ch);
    }

    private void enqueueCharacter(final char ch)
    {
        q.add(ch);
    }

    private char popCharacter()
    {
        return (char) s.pop();
    }

    private char dequeueCharacter()
    {
        return (char) q.remove();
    }

    public static void main(final String[] args)
    {
        final Scanner scan = new Scanner(System.in);
        final String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        final char[] s = input.toCharArray();

        // Create a Solution object:
        final Solution18 p = new Solution18();

        // Enqueue/Push all chars to their respective data structures:
        for (final char c : s)
        {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++)
        {
            if (p.popCharacter() != p.dequeueCharacter())
            {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
            + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
