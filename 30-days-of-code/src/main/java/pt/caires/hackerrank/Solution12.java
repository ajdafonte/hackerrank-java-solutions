package pt.caires.hackerrank;

import java.util.Arrays;
import java.util.Scanner;


class Person2 {

    private final String firstName;
    private final String lastName;
    private final int idNumber;

    // Constructor
    Person2(final String firstName, final String lastName, final int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person2 {

    private final int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(final String firstName, final String lastName, final int id, final int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    private boolean checkRange(final int bottom, final int top, final int num) {
        return bottom <= num && num <= top;
    }

    private boolean checkRangeExclusive(final int bottom, final int top, final int num) {
        return bottom <= num && num < top;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    char calculate() {
        final int avgScore = Arrays.stream(testScores).sum() / testScores.length;
        char grade = 'T'; // < 40
        if (checkRange(90, 100, avgScore)) {
            grade = 'O';
        } else if (checkRangeExclusive(80, 90, avgScore)) {
            grade = 'E';
        } else if (checkRangeExclusive(70, 80, avgScore)) {
            grade = 'A';
        } else if (checkRangeExclusive(55, 70, avgScore)) {
            grade = 'P';
        } else if (checkRangeExclusive(40, 55, avgScore)) {
            grade = 'D';
        }

        return grade;
    }

}

public class Solution12 {

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final String firstName = scan.next();
        final String lastName = scan.next();
        final int id = scan.nextInt();
        final int numScores = scan.nextInt();
        final int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        final Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }

}
