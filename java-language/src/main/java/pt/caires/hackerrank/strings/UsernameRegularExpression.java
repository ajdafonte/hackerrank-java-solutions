package pt.caires.hackerrank.strings;

import java.util.Scanner;


/**
 *
 */
class Validator
{
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "[a-zA-Z]\\w{7,29}";
}

public class UsernameRegularExpression
{
    private static final Scanner scan = new Scanner(System.in);

    public static void main(final String[] args)
    {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0)
        {
            final String userName = scan.nextLine();

            if (userName.matches(Validator.regularExpression))
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
    }
}