package pt.caires.hackerrank.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class TwoDimensionArray {

    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int[][] array = mapFrom(arr);
        System.out.println(calculateHourglassValue(array));

        bufferedReader.close();

    }

    private static int[][] mapFrom(List<List<Integer>> values) {
        return values.stream()
                .map(rowWithValues -> rowWithValues.stream()
                        .mapToInt(Integer::intValue)
                        .toArray())
                .toArray(int[][]::new);
    }

    static int calculateHourglassValue(int[][] arr) {
        int hourglassValue = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            int currentValue;
            for (int j = 0; j < 4; j++) {
                currentValue = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                if (currentValue >= hourglassValue) {
                    hourglassValue = currentValue;
                }
            }
        }
        return hourglassValue;
    }

}
