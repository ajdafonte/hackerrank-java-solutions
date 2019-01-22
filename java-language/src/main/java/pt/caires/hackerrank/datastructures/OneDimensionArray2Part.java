package pt.caires.hackerrank.datastructures;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by aleja on 10/01/2019.
 */
public class OneDimensionArray2Part
{

    // correct full solution: use recursion
    private static boolean isSolvable(int m, int[] arr, int i)
    {
        if (i < 0 || arr[i] == 1)
            return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1)
            return true;

        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }

    // not a full complete solution
    private static void printGame(final int[] game)
    {
        Arrays.stream(game).forEach(elem -> System.out.print(elem + " "));
        System.out.println();
    }

    private static int moveBackward(final int[] game, final int currPos)
    {
        final int backwardPos = currPos - 1;
        return game[backwardPos] == 0 ? backwardPos : -1;
    }

    private static int moveForward(final int[] game, final boolean[] visited, final int currPos, final int leap)
    {
        int finalPos = -1;
        if (game[currPos + 1] == 0 && !visited[currPos + 1])
        {
            finalPos = currPos + 1;
        }
        else if (!visited[currPos + leap] && game[currPos + leap] == 0)
        {
            finalPos = currPos + leap;
        }
        else if (currPos - 1 > 0 && game[currPos - 1] == 0 && !visited[currPos - 1])
        {
            finalPos = currPos - 1;
        }

        return finalPos;
    }

    private static boolean playGame(final int[] game, final int leap)
    {
        final int gameSize = game.length;
        boolean result = false;
        final boolean[] visited = new boolean[gameSize];
        for (int i = 0; i < gameSize; )
        {
            if (i == gameSize - 1 || i + leap >= gameSize)
            {
                result = true;
                break;
            }
            else
            {
                i = moveForward(game, visited, i, leap);
            }
            // check if invalid move or already visited pos
            if (i == -1 || visited[i]
            )
            {
                break;
            }
            // indicate that currPos was visited and continue with loop
            visited[i] = true;
        }

        return result;
    }

    public static void main(final String[] args)
    {
        try (final Scanner sc = new Scanner(System.in))
        {
            final int queries = sc.nextInt();
            for (int i = 0; i < queries; i++)
            {
                final int size = sc.nextInt();
                final int leap = sc.nextInt();
                final int[] game = new int[size];
                for (int j = 0; j < size; j++)
                {
                    game[j] = sc.nextInt();
                }
//                System.out.println("Game num: " + i);
//                printGame(game);
                System.out.println(playGame(game, leap) ? "YES" : "NO");
            }
        }

    }

}
