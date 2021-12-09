package pt.caires.hackerrank.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;


class Result {

    private Result() {
        // NOOP
    }

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING. The function accepts following
     * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
     */
    static String findDay(final int month, final int day, final int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().name();
    }

}

public class DateAndTime {

    public static void main(final String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        final int month = Integer.parseInt(firstMultipleInput[0]);

        final int day = Integer.parseInt(firstMultipleInput[1]);

        final int year = Integer.parseInt(firstMultipleInput[2]);

        final String res = Result.findDay(month, day, year);
        System.out.println(res);

        bufferedReader.close();
    }

}
