package pt.caires.hackerrank.introduction;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class Loops2Test {

    private static Stream<Arguments> serieValues() {
        return Stream.of(
                Arguments.of(0, 0, 2, 2),
                Arguments.of(1, 0, 2, 6),
                Arguments.of(1, 5, 3, 14),
                Arguments.of(4, 5, 3, 98));
    }

    private static Stream<Arguments> seriesValues() {
        return Stream.of(
                Arguments.of(10, 0, 2, asList(2, 6, 14, 30, 62, 126, 254, 510, 1022, 2046)),
                Arguments.of(5, 5, 3, asList(8, 14, 26, 50, 98)));
    }

    @ParameterizedTest
    @MethodSource("serieValues")
    void should_calculate_a_serie(int iterationNumber, int a, int b, int expected) {
        int result = Loops2.calculateSerie(iterationNumber, a, b);

        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("seriesValues")
    void should_calculate_complete_series(int numberSeries, int a, int b, List<Integer> expected) {
        List<Integer> result = Loops2.calculateCompleteSeries(numberSeries, a, b);

        assertThat(result)
                .isNotEmpty()
                .containsExactlyElementsOf(expected);
    }

}