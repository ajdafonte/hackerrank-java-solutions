package pt.caires.hackerrank.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;


/**
 * Created by aleja on 28/12/2018.
 */
class Result
{

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING. The function accepts following
     * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
     */

    public static String findDay(final int month, final int day, final int year)
    {
        System.out.println("pum");
        final GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
        System.out.println(gc != null);
        System.out.println(gc.DAY_OF_MONTH);
        System.out.println(gc.MONTH);
        System.out.println(gc.getWeekYear());
        return gc.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();
    }

}

public class JavaDateTime
{
    public static void main(final String[] args) throws IOException
    {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        final int month = Integer.parseInt(firstMultipleInput[0]);

        final int day = Integer.parseInt(firstMultipleInput[1]);

        final int year = Integer.parseInt(firstMultipleInput[2]);

        final String res = Result.findDay(month, day, year);
        System.out.println(res);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
