package pt.caires.hackerrank.oo_concepts;

import java.util.Scanner;


abstract class Book
{
    String title;

    abstract void setTitle(String s);

    String getTitle()
    {
        return title;
    }
}

class MyBook extends Book
{
    @Override
    void setTitle(final String s)
    {
        this.title = s;
    }
}

/**
 * Created by aleja on 18/01/2019.
 */
public class AbstractClass
{
    public static void main(final String[] args)
    {
        try (final Scanner sc = new Scanner(System.in))
        {
            final String input = sc.nextLine();
            final MyBook myBook = new MyBook();
            myBook.setTitle(input);
            System.out.println("The title is: " + myBook.getTitle());
        }
    }
}
