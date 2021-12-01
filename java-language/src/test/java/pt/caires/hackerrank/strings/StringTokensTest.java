package pt.caires.hackerrank.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

class StringTokensTest {

    private StringTokens stringTokens;

    private static Stream<Arguments> stringsWithSeparators() {
        return Stream.of(
                Arguments.of("He is a very very good boy, isn't he?",
                             asList("He", "is", "a", "very", "very", "good", "boy", "isn", "t", "he"),
                             10),
                Arguments.of("Java ",
                             singletonList("Java"),
                             1),
                Arguments.of(" Java",
                             singletonList("Java"),
                             1),
                Arguments.of(" lol lol    lol",
                             asList("lol", "lol", "lol"),
                             3));
    }

    private static Stream<Arguments> stringsWithoutValidSeparators() {
        return Stream.of(
                Arguments.of("Abracadabra", singletonList("Abracadabra")),
                Arguments.of(" credo ", singletonList("credo")));
    }

    @BeforeEach
    void setUp() {
        this.stringTokens = new StringTokens();
    }

    @ParameterizedTest
    @MethodSource("stringsWithSeparators")
    void should_return_collection_of_words_when_string_with_whitespaces(String input,
                                                                        List<String> expectedResult,
                                                                        int expectedSize) {
        List<String> result = stringTokens.getWordsIn(input);

        assertThat(result)
                .isNotEmpty()
                .hasSize(expectedSize)
                .containsExactlyElementsOf(expectedResult);
    }

    @ParameterizedTest
    @MethodSource("stringsWithoutValidSeparators")
    void should_return_empty_collection_of_words_when_string_without_whitespaces(String input,
                                                                                 List<String> expectedResult) {
        List<String> result = stringTokens.getWordsIn(input);

        assertThat(result)
                .isNotEmpty()
                .hasSize(1)
                .containsExactlyElementsOf(expectedResult);
    }

    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {"€€€€€€€", " "})
    void should_return_empty_collection_of_words_when_invalid_string(String input) {
        List<String> result = stringTokens.getWordsIn(input);

        assertThat(result).isEmpty();
    }

}