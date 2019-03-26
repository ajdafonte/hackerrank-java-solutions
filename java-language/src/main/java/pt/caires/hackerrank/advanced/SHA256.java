package pt.caires.hackerrank.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 */
public class SHA256
{
    private static final int MIN_SIZE = 6;
    private static final int MAX_SIZE = 20;
    private static final String COMPLIANT_PATTERN = "^[A-Za-z0-9]+$";

    public static void main(final String[] args)
    {
        try (final Scanner sc = new Scanner(System.in))
        {
            final String input = sc.nextLine();
            final String result = handleSha256Hash(input);
            System.out.println(result);
        }
        catch (final NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
    }

    static String handleSha256Hash(final String input) throws NoSuchAlgorithmException
    {
        final int inputSize = input.length();
        final String result = "Constraint Violated";
        if (inputSize >= MIN_SIZE && inputSize <= MAX_SIZE)
        {
            final Pattern pattern = Pattern.compile(COMPLIANT_PATTERN);
            final Matcher matcher = pattern.matcher(input);
            if (matcher.matches())
            {
                return getSha256Hash(input);
            }
        }

        return result;
    }

    private static String getSha256Hash(final String input) throws NoSuchAlgorithmException
    {
        final MessageDigest md = MessageDigest.getInstance("SHA-256");
        final byte[] hashBytes = md.digest(input.getBytes());
        final StringBuilder result = new StringBuilder();
        for (final byte b : hashBytes)
        {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}
