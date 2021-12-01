package pt.caires.hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramsTest {

    private static Stream<Arguments> validAnagrams() {
        return Stream.of(
                Arguments.of("anagram", "margana"),
                Arguments.of("piupiu", "uipuip"));
    }

    private static Stream<Arguments> invalidAnagrams() {
        return Stream.of(
                Arguments.of("anagramm", "marganaa"),
                Arguments.of("piupiuu", "uipuipp"));
    }

    @ParameterizedTest
    @MethodSource("validAnagrams")
    void should_be_an_valid_anagram(String value1, String value2) {
        assertThat(Anagrams.isAnagram(value1, value2)).isTrue();
    }

    @ParameterizedTest
    @MethodSource("invalidAnagrams")
    void should_be_a_invalid_anagram(String value1, String value2) {
        assertThat(Anagrams.isAnagram(value1, value2)).isFalse();
    }

}