package pt.caires.hackerrank.datastructures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


class JavaStackTest {

    @ParameterizedTest
    @ValueSource(strings = {"{}()", "[{()}]", "({()})", "[]"})
    void should_be_balanced(String input) {
        assertThat(JavaStack.isBalanced(input)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"{}(", "({)}", "[[", "}{"})
    void should_not_be_balanced(String input) {
        assertThat(JavaStack.isBalanced(input)).isFalse();
    }

}
