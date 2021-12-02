package pt.caires.hackerrank.introduction;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class IfElseTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 7, 21, 25})
    void should_indicate_that_odd_number_is_weird(int input) {
        String result = IfElse.getWeirdnessLevel(input);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Weird");
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 20})
    void should_indicate_that_even_number_is_weird(int input) {
        String result = IfElse.getWeirdnessLevel(input);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Weird");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 22})
    void should_indicate_that_even_number_is_not_weird(int input) {
        String result = IfElse.getWeirdnessLevel(input);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Not Weird");
    }

}