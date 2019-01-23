package pt.caires.hackerrank.advanced.lambdaexpr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 *
 */
public class LambdaExpressions2
{
    public static void main(final String[] args) throws IOException
    {
        final MyMath ob = new MyMath();
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0)
        {
            final String s = br.readLine().trim();
            final StringTokenizer st = new StringTokenizer(s);
            final int ch = Integer.parseInt(st.nextToken());
            final int num = Integer.parseInt(st.nextToken());
            if (ch == 1)
            {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            }
            else if (ch == 2)
            {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            }
            else if (ch == 3)
            {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
