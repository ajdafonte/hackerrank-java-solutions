package pt.caires.hackerrank.oo_programming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ArithmeticTest {

    public static Stream<Arguments> numValues() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(-1, 2, 1),
                Arguments.of(-1, 0, -1));
    }

    @ParameterizedTest
    @MethodSource("numValues")
    void should_add_two_values(int value1, int value2, int expected) {
        Arithmetic arithmetic = new Arithmetic();

        int result = arithmetic.add(value1, value2);

        Assertions.assertThat(result).isEqualTo(expected);
    }

}