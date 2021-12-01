package pt.caires.hackerrank.oo_programming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MyCalculatorTest {

    private static Stream<Arguments> divisorSumValues() {
        return Stream.of(
                Arguments.of(6, 12),
                Arguments.of(1, 1),
                Arguments.of(13, 14),
                Arguments.of(1000, 2340));
    }

    @ParameterizedTest
    @MethodSource("divisorSumValues")
    void should_sum_all_divisors_of(int input, int expected) {
        MyCalculator myCalculator = new MyCalculator();

        int result = myCalculator.divisorSum(input);

        Assertions.assertThat(result).isEqualTo(expected);
    }

}