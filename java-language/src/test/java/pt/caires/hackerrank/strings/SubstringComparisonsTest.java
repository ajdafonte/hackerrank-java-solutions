package pt.caires.hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SubstringComparisonsTest {

    private static Stream<Arguments> validInputsAndExpectedResults() {
        return Stream.of(
                Arguments.of("welcometojava", 3, "ava" + "\n" + "wel"),
                Arguments.of("welcometojava", 1, "a" + "\n" + "w"));
    }

    @ParameterizedTest
    @MethodSource("validInputsAndExpectedResults")
    void should_return_smallest_and_largest_lexicographical_substrings(String input,
                                                                       int substringSize,
                                                                       String expected) {
        String result = SubstringComparisons.getSmallestAndLargest(input, substringSize);

        assertThat(result)
                .isNotBlank()
                .isEqualTo(expected);
    }

}