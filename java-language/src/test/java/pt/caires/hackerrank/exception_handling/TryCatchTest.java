package pt.caires.hackerrank.exception_handling;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class TryCatchTest {

    @Test
    void should_calculate_special_division() {
        Long result = TryCatch.specialDivision("10", "3");

        assertThat(result)
                .isNotNull()
                .isEqualTo(3);
    }

    @Test
    void should_fail_with_arithmetic_exception_when_division_by_zero() {
        Throwable throwable = catchThrowable(() -> TryCatch.specialDivision("10", "0"));

        assertThat(throwable)
                .isNotNull()
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("/ by zero");
    }

    @Test
    void should_fail_with_input_mismatch_exception_when_not_a_number() {
        Throwable throwable = catchThrowable(() -> TryCatch.specialDivision("10", "Hello"));

        assertThat(throwable)
                .isNotNull()
                .isInstanceOf(InputMismatchException.class);
    }

    @Test
    void should_fail_with_input_mismatch_exception_when_number_is_not_32_bit_signed() {
        Throwable throwable = catchThrowable(() -> TryCatch.specialDivision("10", "23.232"));

        assertThat(throwable)
                .isNotNull()
                .isInstanceOf(InputMismatchException.class);
    }

}