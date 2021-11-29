package pt.caires.hackerrank.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


class FactoryPatternTest {

    private FoodFactory foodFactory;

    @BeforeEach
    void setUp() {
        this.foodFactory = new FoodFactory();
    }

    @Test
    void should_create_a_cake() {
        Food result = foodFactory.getFood("cake");

        assertThat(result)
                .isNotNull()
                .isInstanceOf(Cake.class);
    }

    @Test
    void should_create_a_pizza() {
        Food result = foodFactory.getFood("pizza");

        assertThat(result)
                .isNotNull()
                .isInstanceOf(Pizza.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", ""})
    void should_be_undefined_when_invalid_food(String input) {
        Food result = foodFactory.getFood(input);

        assertThat(result).isNull();
    }

}
