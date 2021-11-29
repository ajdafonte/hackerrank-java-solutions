package pt.caires.hackerrank.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LeftRotationTest {

    private static Stream<Arguments> validLeftRotations() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 2, new int[]{3, 4, 5, 1, 2}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4, new int[]{5, 1, 2, 3, 4}));
    }

    private static Stream<Arguments> noLeftRotations() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 0, new int[]{1, 2, 3, 4, 5}));
    }

    @ParameterizedTest
    @MethodSource("validLeftRotations")
    void should_generate_valid_left_rotations(int[] input, int numRotations, int[] expected) {
        int[] result = LeftRotation.rotLeft(input, numRotations);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(expected);
    }

    @ParameterizedTest
    @MethodSource("noLeftRotations")
    void should_not_generate_left_rotations(int[] input, int numRotations, int[] expected) {
        int[] result = LeftRotation.rotLeft(input, numRotations);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(expected);
    }

}
