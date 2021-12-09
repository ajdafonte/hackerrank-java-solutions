package pt.caires.hackerrank.datastructures;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class JavaHashsetTest {

    @Test
    void should_print_in_console_amount_of_unique_pairs() {
        String[] leftPairValues = new String[]{"ale", "cai", "ale"};
        String[] rightPairValues = new String[]{"jandro", "res", "jandro"};
        int numPairs = 3;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        JavaHashset.printUniquePairs(numPairs, leftPairValues, rightPairValues);

        String[] result = outputStream.toString().split(System.lineSeparator());

        assertThat(result)
                .isNotEmpty()
                .containsExactly("1", "2", "2");
    }

}