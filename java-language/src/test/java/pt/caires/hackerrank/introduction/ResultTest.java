package pt.caires.hackerrank.introduction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    @Test
    void should_return_name_of_day() {
        String result = Result.findDay(2, 4, 1986);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("TUESDAY");
    }

}