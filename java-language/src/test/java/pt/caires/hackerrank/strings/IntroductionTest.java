package pt.caires.hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IntroductionTest {

    private static Stream<Arguments> stringValues() {
        return Stream.of(
                Arguments.of("hello", "java", 9),
                Arguments.of(" ", "java", 5),
                Arguments.of("java", "", 4));
    }

    private static Stream<Arguments> notLexicographicalValues() {
        return Stream.of(
                Arguments.of("a", "b"),
                Arguments.of("abc", "abd"),
                Arguments.of("abc", "def"));
    }

    private static Stream<Arguments> lexicographicalValues() {
        return Stream.of(
                Arguments.of("b", "adef"),
                Arguments.of("abd", "abc"),
                Arguments.of("def", "abc"));
    }

    private static Stream<Arguments> camelCaseValues() {
        return Stream.of(
                Arguments.of("hello", "Hello"),
                Arguments.of("java", "Java"),
                Arguments.of("a", "A"));
    }

    @ParameterizedTest
    @MethodSource("stringValues")
    void should_return_length_sum_of_two_strings(String input1, String input2, int expected) {
        int result = Introduction.sumStringLength(input1, input2);

        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("lexicographicalValues")
    void should_be_lexicographically_larger(String input1, String input2) {
        String result = Introduction.isLexicographicallyGreater(input1, input2);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Yes");
    }

    @ParameterizedTest
    @MethodSource("notLexicographicalValues")
    void should_not_be_lexicographically_larger_than_input2(String input1, String input2) {
        String result = Introduction.isLexicographicallyGreater(input1, input2);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("No");
    }

    @ParameterizedTest
    @MethodSource("camelCaseValues")
    void should_convert_string_to_camel_case(String input, String expected) {
        StringBuilder result = Introduction.toCamelCase(input);

        assertThat(result.toString())
                .isNotBlank()
                .isEqualTo(expected);
    }

}