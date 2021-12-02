package pt.caires.hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class ValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"Samantha", "Samantha_24"})
    void should_be_a_valid_username(String input) {
        assertThat(input).matches(Validator.regularExpression);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Julia", "1Samantha", "Samantha?10_24"})
    void should_be_an_invalid_username(String input) {
        assertThat(input).doesNotMatch(Validator.regularExpression);
    }


}