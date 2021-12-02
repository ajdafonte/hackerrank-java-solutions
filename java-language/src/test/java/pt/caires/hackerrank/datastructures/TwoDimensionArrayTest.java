package pt.caires.hackerrank.datastructures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoDimensionArrayTest {

    @Test
    void should_calculate_hourglass_value() {
        int[][] input = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int result = TwoDimensionArray.calculateHourglassValue(input);

        assertThat(result).isEqualTo(19);
    }

}