package pt.caires.hackerrank.introduction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DatatypesTest {

    private Datatypes datatypes;

    @BeforeEach
    void setUp() {
        this.datatypes = new Datatypes();
    }

    @Test
    void should_return_collection_of_supported_datatypes_when_long_value() {
        List<Class<? extends Number>> result = datatypes.getSupportedDataTypesBy(-1000000000000000000L);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(Long.TYPE);
    }

    @Test
    void should_return_collection_of_supported_datatypes_when_int_value() {
        List<Class<? extends Number>> result = datatypes.getSupportedDataTypesBy(150000);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(Integer.TYPE, Long.TYPE);
    }

    @Test
    void should_return_collection_of_supported_datatypes_when_short_value() {
        List<Class<? extends Number>> result = datatypes.getSupportedDataTypesBy(-150);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(Short.TYPE, Integer.TYPE, Long.TYPE);
    }

    @Test
    void should_return_collection_of_supported_datatypes_when_byte_value() {
        List<Class<? extends Number>> result = datatypes.getSupportedDataTypesBy(126);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE);
    }

    @Test
    void should_print_in_console_supported_datatypes_in_lowercase() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        datatypes.printSupportedDataTypes(Arrays.asList(Integer.TYPE, Long.TYPE));

        String[] result = outputStream.toString().split(System.lineSeparator());

        assertThat(result)
                .isNotEmpty()
                .containsExactly("* int", "* long");
    }

    @Test
    void should_not_print_in_console_when_no_supported_datatypes() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        datatypes.printSupportedDataTypes(Collections.emptyList());

        String[] result = outputStream.toString().split(System.lineSeparator());

        assertThat(result)
                .isNotEmpty()
                .containsExactly("");
    }

}