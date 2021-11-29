package pt.caires.hackerrank.warmup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class JumpingCloudsTest {

    private static Stream<Arguments> clouds() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 0, 0, 1, 0}, 3),
                Arguments.of(new int[]{0, 0, 0, 0, 1, 0}, 3),
                Arguments.of(new int[]{0, 0, 1, 0, 0, 1, 0}, 4),
                Arguments.of(new int[]{0, 0, 0, 0}, 2),
                Arguments.of(new int[]{0, 1, 0, 1, 0, 1, 0, 0, 1, 0}, 5));
    }

    @ParameterizedTest
    @MethodSource("clouds")
    void should_count_number_of_jump_in_clouds(int[] input, int expected) {
        assertThat(JumpingClouds.jumpingOnClouds(input)).isEqualTo(expected);
    }

}

