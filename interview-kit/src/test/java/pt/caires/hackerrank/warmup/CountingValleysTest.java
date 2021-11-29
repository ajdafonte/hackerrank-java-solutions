package pt.caires.hackerrank.warmup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


class CountingValleysTest {

    private static Stream<Arguments> withValleys() {
        return Stream.of(
                Arguments.of("UDDDUDUU", 8, 1),
                Arguments.of("DDUUUUDD", 8, 1),
                Arguments.of("DDUUUUDDDU", 10, 2));
    }

    private static Stream<Arguments> withoutValleys() {
        return Stream.of(
                Arguments.of("UUUU", 4, 0),
                Arguments.of("DDDDU", 5, 0));
    }

    @ParameterizedTest
    @MethodSource("withValleys")
    void should_count_some_existing_valleys(String input, int numSteps, int expected) {
        assertThat(CountingValleys.countingValleys(numSteps, input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("withoutValleys")
    void should_count_zero_valleys(String input, int numSteps, int expected) {
        assertThat(CountingValleys.countingValleys(numSteps, input)).isEqualTo(expected);
    }

}
