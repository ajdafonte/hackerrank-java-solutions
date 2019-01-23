package pt.caires.hackerrank.introduction;

import java.security.Permission;
import java.util.Scanner;


/**
 *
 */
public class IntToString
{
    public static void main(final String[] args)
    {

        DoNotTerminate.forbidExit();

        try
        {
            final Scanner in = new Scanner(System.in);
            final int n = in.nextInt();
            in.close();
            final String s = String.valueOf(n);

            if (n == Integer.parseInt(s))
            {
                System.out.println("Good job");
            }
            else
            {
                System.out.println("Wrong answer.");
            }
        }
        catch (final DoNotTerminate.ExitTrappedException e)
        {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate
{

    static class ExitTrappedException extends SecurityException
    {

        private static final long serialVersionUID = 1;
    }

    static void forbidExit()
    {
        final SecurityManager securityManager = new SecurityManager()
        {
            @Override
            public void checkPermission(final Permission permission)
            {
                if (permission.getName().contains("exitVM"))
                {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
