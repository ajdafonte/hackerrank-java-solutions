package pt.caires.hackerrank.introduction;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class EndOfFileTest {

    @Test
    void should_print_in_console_line_number_and_content_read_from_user_input() {
        String userInput =
                String.format("Hello world%sI am a file%sRead me until end-of-file.",
                              System.lineSeparator(),
                              System.lineSeparator());
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        EndOfFile endOfFile = new EndOfFile();
        endOfFile.printLineNumberAndContentFromUserInput();

        String[] result = outputStream.toString().split(System.lineSeparator());

        assertThat(result)
                .isNotEmpty()
                .containsExactly("1 Hello world",
                                 "2 I am a file",
                                 "3 Read me until end-of-file.");
    }

}