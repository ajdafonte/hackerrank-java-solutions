package pt.caires.hackerrank.advanced.lambdaexpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class MyMathTest {

    private MyMath myMath;

    @BeforeEach
    void setUp() {
        this.myMath = new MyMath();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 9})
    void should_check_that_is_an_odd_number(int input) {
        boolean result = MyMath.checker(myMath.isOdd(), input);

        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 12})
    void should_check_that_is_an_even_number(int input) {
        boolean result = MyMath.checker(myMath.isOdd(), input);

        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 7})
    void should_check_that_is_a_prime_number(int input) {
        boolean result = MyMath.checker(myMath.isPrime(), input);

        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6})
    void should_check_that_is_not_a_prime_number(int input) {
        boolean result = MyMath.checker(myMath.isPrime(), input);

        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {898, 8})
    void should_check_that_is_a_palindrome_number(int input) {
        boolean result = MyMath.checker(myMath.isPalindrome(), input);

        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 899})
    void should_check_that_is_not_a_palindrome_number(int input) {
        boolean result = MyMath.checker(myMath.isPalindrome(), input);

        assertThat(result).isFalse();
    }

}