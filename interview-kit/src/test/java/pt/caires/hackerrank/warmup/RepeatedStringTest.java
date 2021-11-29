package pt.caires.hackerrank.warmup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


class RepeatedStringTest {

    private static Stream<Arguments> repeatedWords() {
        return Stream.of(
                Arguments.of("abcac", 10L, 4L),
                Arguments.of("aba", 10L, 7L),
                Arguments.of("a", 1000000000000L, 1000000000000L),
                Arguments.of("bbbaaaaa", 11L, 5L),
                Arguments.of("abab", 2L, 1L));
    }

    @ParameterizedTest
    @MethodSource("repeatedWords")
    void should_count_number_of_letter_a_in_repeated_word(String word, long numRepetitions, long expected) {
        assertThat(RepeatedString.repeatedString(word, numRepetitions)).isEqualTo(expected);
    }

}
