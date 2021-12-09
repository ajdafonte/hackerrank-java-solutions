package pt.caires.hackerrank.datastructures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class OneDimensionArrayPart2Test {

    private static Stream<Arguments> gamesToNotWin() {
        return Stream.of(
                Arguments.of(3, new int[]{0, 0, 1, 1, 1, 0}),
                Arguments.of(1, new int[]{0, 1, 0}));
    }

    private static Stream<Arguments> gamesToWin() {
        return Stream.of(
                Arguments.of(3, new int[]{0, 0, 0, 0, 0}),
                Arguments.of(5, new int[]{0, 0, 0, 1, 1, 1}));
    }

    @ParameterizedTest
    @MethodSource("gamesToWin")
    void should_win_game(int leap, int[] game) {
        assertThat(OneDimensionArrayPart2.canWin(leap, game)).isTrue();
    }

    @ParameterizedTest
    @MethodSource("gamesToNotWin")
    void should_not_win_game(int leap, int[] game) {
        assertThat(OneDimensionArrayPart2.canWin(leap, game)).isFalse();
    }

}