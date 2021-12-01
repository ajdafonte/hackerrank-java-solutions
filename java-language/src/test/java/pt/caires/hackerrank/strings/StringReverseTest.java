package pt.caires.hackerrank.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringReverseTest {

    @ParameterizedTest
    @ValueSource(strings = {"madam", "pop", "a", "", " "})
    void should_be_palindrome(String input) {
        assertThat(StringReverse.isPalindrome(input)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"madame", "popr"})
    void should_not_be_palindrome(String input) {
        assertThat(StringReverse.isPalindrome(input)).isFalse();
    }

}