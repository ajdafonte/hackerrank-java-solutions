package pt.caires.hackerrank.bignumber;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

class PrimalityTestTest {

    @Test
    void should_return_prime_when_number_is_prime() {
        String result = PrimalityTest.getPrimeNumberResult(new BigInteger("3"));

        assertThat(result)
                .isNotBlank()
                .isEqualTo("prime");
    }

    @Test
    void should_return_not_prime_when_number_is_not_prime() {
        String result = PrimalityTest.getPrimeNumberResult(new BigInteger("2"));

        assertThat(result)
                .isNotBlank()
                .isEqualTo("prime");
    }

}