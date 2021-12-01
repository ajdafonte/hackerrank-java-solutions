package pt.caires.hackerrank;

import java.util.Scanner;


abstract class Book {

    String title;
    String author;

    Book(final String title, final String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();

}

class MyBook extends Book {

    // Declare the price instance variable
    private final int price;

    /**
     * Class Constructor
     *
     * @param title  The book's title.
     * @param author The book's author.
     * @param price  The book's price.
     **/
    // Write your constructor here
    MyBook(final String title, final String author, final int price) {
        super(title, author);
        this.price = price;
    }

    /**
     * Method Name: display
     * <p>
     * Print the title, author, and price in the specified format.
     **/
    // Write your method here
    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}


public class Solution13 {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String title = scanner.nextLine();
        final String author = scanner.nextLine();
        final int price = scanner.nextInt();
        scanner.close();

        final Book book = new MyBook(title, author, price);
        book.display();
    }

}
