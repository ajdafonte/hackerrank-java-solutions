package pt.caires.hackerrank.strings;

import java.util.Scanner;


/**
 * Created by aleja on 29/12/2018.
 */
class Validator
{
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "[a-zA-Z]\\w{7,29}";
}

public class UsernameValidator
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