package pt.caires.hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class PatternSyntaxCheckerTest {

    @ParameterizedTest
    @ValueSource(strings = {"([A-Z])(.+)", ".*"})
    void should_be_a_valid_pattern(String input) {
        String result = PatternSyntaxChecker.checkPattern(input);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Valid");
    }

    @ParameterizedTest
    @ValueSource(strings = {"[AZ[a-z](a-z)", "(((", "batcatpat(nat"})
    void should_be_an_invalid_pattern(String input) {
        String result = PatternSyntaxChecker.checkPattern(input);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Invalid");
    }

}