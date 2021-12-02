package pt.caires.hackerrank.introduction;

import java.util.Scanner;

// TODO: 02/12/2021 - Check if standard in/out testing can be added
// See: https://www.danvega.dev/blog/2020/12/16/testing-standard-in-out-java/
public class EndOfFile {

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            int count = 1;
            while (sc.hasNext()) {
                System.out.println(count++ + " " + sc.nextLine());
            }
        }
    }

}
