package pt.caires.hackerrank.bignumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BigDecimalIntroTest {

    private static Stream<Arguments> inputWithBlankValues() {
        return Stream.of(
                Arguments.of((Object) new String[]{"-100", null, "90", "0.12"}),
                Arguments.of((Object) new String[]{"-100", "", "90", "0.12"}),
                Arguments.of((Object) new String[]{"-100", " ", "90", "0.12"}));
    }

    @Test
    void should_return_collection_real_numbers_in_desc_order() {
        String[] input = new String[]{"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

        String[] result = BigDecimalIntro.getRealNumbersInDescOrder(input);

        assertThat(result)
                .isNotEmpty()
                .containsExactly("90", "56.6", "50", "02.34", "0.12", ".12", "0", "000.000", "-100");
    }

    @ParameterizedTest
    @MethodSource("inputWithBlankValues")
    void should_return_collection_real_numbers_in_desc_order_ignoring_blank_elements(String[] input) {
        String[] result = BigDecimalIntro.getRealNumbersInDescOrder(input);

        assertThat(result)
                .isNotEmpty()
                .containsExactly("90", "0.12", "-100");
    }

}