package pt.caires.hackerrank.exception_handling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class ExceptionHandlingTest {

    @Test
    void should_calculate_power_value() throws Exception {
        int result = ExceptionHandling.my_calculator.power(2, 2);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void should_fail_to_calculate_power_value_when_input_value_is_negative() {
        Throwable throwable = catchThrowable(() -> ExceptionHandling.my_calculator.power(2, -1));

        assertThat(throwable)
                .isNotNull()
                .isInstanceOf(Exception.class)
                .hasMessage("n or p should not be negative.");
    }

    @Test
    void should_fail_to_calculate_power_value_when_input_values_are_zero() {
        Throwable throwable = catchThrowable(() -> ExceptionHandling.my_calculator.power(0, 0));

        assertThat(throwable)
                .isNotNull()
                .isInstanceOf(Exception.class)
                .hasMessage("n and p should not be zero.");
    }

}