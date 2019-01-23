package pt.caires.hackerrank.datastructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


/**
 * Created by aleja on 10/01/2019.
 */
class Player
{
    private final String name;
    private final int score;

    Player(final String name, final int score)
    {
        this.name = name;
        this.score = score;
    }

    String getName()
    {
        return name;
    }

    int getScore()
    {
        return score;
    }

    @Override
    public String toString()
    {
        return name + " " + score;
    }
}

class Checker implements Comparator<Player>
{
    @Override
    public int compare(final Player o1, final Player o2)
    {
        if (o1.getScore() == o2.getScore())
        {
            return o1.getName().compareTo(o2.getName());
        }
        return Integer.compare(o2.getScore(), o1.getScore());
    }
}

/**
 *
 */
public class JavaComparator
{
    private static boolean checkScore(final int score)
    {
        return score >= 0 && score <= 1000;
    }

    private static void printPlayers(final Player[] players)
    {
        Arrays.stream(players).forEach(System.out::println);
    }

    public static void main(final String[] args)
    {
        try (final Scanner sc = new Scanner(System.in))
        {
            // handle input and create players
            final int numPlayers = sc.nextInt();
            final Player[] players = new Player[numPlayers];
            for (int i = 0; i < numPlayers; i++)
            {
                final String name = sc.next();
                final int score = sc.nextInt();
                if (checkScore(score))
                {
                    players[i] = new Player(name, score);
                }
            }

            // Other option
//            // execute sort
//            Arrays.sort(players, new Checker());
//
//            // print players array
//            printPlayers(players);

            Arrays.stream(players)
                .sorted(new Checker())
                .forEach(System.out::println);

        }
    }
}
