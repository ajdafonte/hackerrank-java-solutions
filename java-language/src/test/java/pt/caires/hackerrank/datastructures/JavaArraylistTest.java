package pt.caires.hackerrank.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;


class JavaArraylistTest {

    private JavaArraylist javaArraylist;

    @BeforeEach
    void setUp() {
        this.javaArraylist = new JavaArraylist();
    }

    @Test
    void should_initialize_datasource_from_user_input() {
        String userInput = String.format("2%s3 1 2 3%s2 4 6", System.lineSeparator(), System.lineSeparator());
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);
        Scanner sc = new Scanner(System.in);

        List<List<Integer>> result = javaArraylist.initializeDataSource(sc);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(asList(1, 2, 3),
                                 asList(4, 6));
    }

    @Test
    void should_return_number_found_in_datasource() {
        List<List<Integer>> dataSource = Arrays.asList(asList(1, 2, 3), asList(4, 6));

        Optional<Integer> result = javaArraylist.findNumberIn(dataSource, 1, 1);

        assertThat(result)
                .isPresent()
                .hasValue(6);
    }

    @Test
    void should_return_empty_number_when_line_not_found_in_datasource() {
        List<List<Integer>> dataSource = Arrays.asList(asList(1, 2, 3), asList(4, 6));

        Optional<Integer> result = javaArraylist.findNumberIn(dataSource, 3, 1);

        assertThat(result).isNotPresent();
    }

    @Test
    void should_return_empty_number_when_position_in_existent_line_not_found_in_datasource() {
        List<List<Integer>> dataSource = Arrays.asList(asList(1, 2, 3), asList(4, 6));

        Optional<Integer> result = javaArraylist.findNumberIn(dataSource, 1, 4);

        assertThat(result).isNotPresent();
    }

}