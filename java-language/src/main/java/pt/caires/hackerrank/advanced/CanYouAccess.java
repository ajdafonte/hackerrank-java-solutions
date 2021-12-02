package pt.caires.hackerrank.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;


public class CanYouAccess {

    public static void main(final String[] args) throws Exception {
        DoNotTerminate.forbidExit();

        try {
            final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            final int num = Integer.parseInt(br.readLine().trim());
            final Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

            //Write your code here
            o = new CanYouAccess.Inner().new Private();
            final String result = ((Inner.Private) o).powerof2(num);
            System.out.println(num + " is " + result);

            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try

        catch (final DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main

    static class Inner {

        private class Private {

            private String powerof2(final int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }

        }

    }//end of Inner

}//end of Solution

class DoNotTerminate { //This class prevents exit(0)

    static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(final Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }

    static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;

    }

}
