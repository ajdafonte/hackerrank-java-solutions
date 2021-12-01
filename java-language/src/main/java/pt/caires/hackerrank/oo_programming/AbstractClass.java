package pt.caires.hackerrank.oo_programming;

import java.util.Scanner;


abstract class Book {

    String title;

    String getTitle() {
        return title;
    }

    abstract void setTitle(String s);

}

class MyBook extends Book {

    @Override
    void setTitle(final String s) {
        this.title = s;
    }

}


public class AbstractClass {

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final String input = sc.nextLine();
            final MyBook myBook = new MyBook();
            myBook.setTitle(input);
            System.out.println("The title is: " + myBook.getTitle());
        }
    }

}
