package pt.caires.hackerrank.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


class PrimeCheckerTest {

    private Prime prime;

    @BeforeEach
    void setUp() {
        this.prime = new Prime();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 23})
    void should_be_a_prime_number(int input) {
        assertThat(prime.isPrime(input)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 8, 9, 10, 12, 22})
    void should_not_be_a_prime_number(int input) {
        assertThat(prime.isPrime(input)).isFalse();
    }

}
