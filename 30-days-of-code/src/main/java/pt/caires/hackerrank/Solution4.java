package pt.caires.hackerrank;

import java.util.Scanner;


class Person {

    private int age;

    Person(final int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge > 0) {
            this.age = initialAge;
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
    }

    void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String textResult = "You are old.";
        if (age < 13) {
            textResult = "You are young.";
        } else if (age < 18) {
            textResult = "You are a teenager.";
        }
        System.out.println(textResult);
    }

    void yearPasses() {
        // Increment this person's age.
        age++;
    }

}

public class Solution4 {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            final int age = sc.nextInt();
            final Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

}
