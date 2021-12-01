package pt.caires.hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pt.caires.hackerrank.strings.Regex.MyRegex;

import static org.assertj.core.api.Assertions.assertThat;

class RegexTest {

    @ParameterizedTest
    @ValueSource(strings = {"000.12.12.034", "121.234.12.12", "23.45.12.56"})
    void should_be_a_valid_ip(String input) {
        assertThat(input).matches(MyRegex.pattern);
    }

    @ParameterizedTest
    @ValueSource(strings = {"000.12.234.23.23", "666.666.23.23", ".213.123.23.32", "23.45.22.32.", "I.Am.not.an.ip"})
    void should_be_an_invalid_ip(String input) {
        assertThat(input).doesNotMatch(MyRegex.pattern);
    }

}