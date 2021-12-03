package pt.caires.hackerrank.datastructures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SubArrayTest {

    private static Stream<Arguments> subArrayValues() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 0),
                Arguments.of(new int[]{1, -2, 4, -5, 1}, 9));
    }

    @ParameterizedTest
    @MethodSource("subArrayValues")
    void should_return_number_of_negative_subarrays(int[] input, int expected) {
        int result = SubArray.getNumOfNegativeSubarrays(input);

        assertThat(result).isEqualTo(expected);
    }

}