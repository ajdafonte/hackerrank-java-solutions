package pt.caires.hackerrank.datastructures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class JavaSortTest {

    @Test
    void should_sort_students_by_cgpa_in_decreasing_order() {
        Student mickey = new Student(1, "mickey", 4.0);
        Student pluto = new Student(2, "pluto", 2.0);
        List<Student> result = Arrays.asList(pluto, mickey);

        result.sort(JavaSort.STUDENT_COMPARATOR);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(mickey, pluto);
    }

    @Test
    void should_sort_students_with_same_cgpa_by_first_name() {
        Student mickey = new Student(1, "mickey", 4.0);
        Student donald = new Student(2, "donald", 4.0);
        Student pluto = new Student(3, "pluto", 2.0);
        List<Student> result = Arrays.asList(pluto, donald, mickey);

        result.sort(JavaSort.STUDENT_COMPARATOR);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(donald, mickey, pluto);
    }

    @Test
    void should_sort_students_with_same_cgpa_and_first_name_by_id() {
        Student mickey1 = new Student(1, "mickey", 4.0);
        Student mickey2 = new Student(2, "mickey", 4.0);
        Student pluto = new Student(3, "pluto", 2.0);
        List<Student> result = Arrays.asList(pluto, mickey2, mickey1);

        result.sort(JavaSort.STUDENT_COMPARATOR);

        assertThat(result)
                .isNotEmpty()
                .containsExactly(mickey1, mickey2, pluto);
    }

}