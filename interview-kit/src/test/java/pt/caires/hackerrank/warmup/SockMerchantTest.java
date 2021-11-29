package pt.caires.hackerrank.warmup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


class SockMerchantTest {

    private static Stream<Arguments> merchantSocks() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1, 2, 1, 3, 2}, 2),
                Arguments.of(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, 4),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 0));
    }

    @ParameterizedTest
    @MethodSource("merchantSocks")
    void should_count_number_of_paired_socks(int[] socks, int expected) {
        assertThat(SockMerchant.sockMerchant(socks.length, socks)).isEqualTo(expected);
    }

}
