package pt.caires.hackerrank.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

class JavaListTest {

    private JavaList javaList;

    @BeforeEach
    void setUp() {
        this.javaList = new JavaList();
    }

    @Test
    void should_initialize_datasource_from_user_input() {
        String userInput = String.format("5%s1 2 3 4 5", System.lineSeparator());
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);
        Scanner sc = new Scanner(inputStream);

        List<Integer> result = javaList.initializeDataSource(sc);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    void should_return_datasource_with_new_element_when_insert_operation() {
        String userInput = String.format("1%sInsert%s3 23", System.lineSeparator(), System.lineSeparator());
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);
        Scanner sc = new Scanner(inputStream);

        List<Integer> dataSource = new ArrayList<>();
        dataSource.add(12);
        dataSource.add(0);
        dataSource.add(1);
        dataSource.add(78);
        dataSource.add(12);

        List<Integer> result = javaList.performOperationsIn(sc, dataSource);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(12, 0, 1, 23, 78, 12);
    }

    @Test
    void should_return_datasource_without_element_when_delete_operation() {
        String userInput = String.format("1%sDelete%s1", System.lineSeparator(), System.lineSeparator());
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);
        Scanner sc = new Scanner(inputStream);

        List<Integer> dataSource = new ArrayList<>();
        dataSource.add(12);
        dataSource.add(0);
        dataSource.add(1);
        dataSource.add(78);
        dataSource.add(12);

        List<Integer> result = javaList.performOperationsIn(sc, dataSource);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(12, 1, 78, 12);
    }


}