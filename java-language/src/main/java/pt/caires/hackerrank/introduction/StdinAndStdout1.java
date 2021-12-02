package pt.caires.hackerrank.introduction;

import java.util.Scanner;


public class StdinAndStdout1 {

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int a = scan.nextInt();
        final int b = scan.nextInt();
        final int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();
    }

}
