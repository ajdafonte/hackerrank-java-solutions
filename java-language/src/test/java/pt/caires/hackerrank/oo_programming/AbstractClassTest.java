package pt.caires.hackerrank.oo_programming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AbstractClassTest {

    @Test
    void should_be_instance_of_book() {
        Book result = new MyBook();

        assertThat(result)
                .isNotNull()
                .isInstanceOf(Book.class);
    }

    @Test
    void should_get_book_title() {
        Book book = new MyBook();
        book.setTitle("test");

        String result = book.getTitle();

        assertThat(result)
                .isNotBlank()
                .isEqualTo("test");
    }

}