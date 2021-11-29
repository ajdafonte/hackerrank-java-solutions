package pt.caires.hackerrank.advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CovariantReturnTypesTest {

    @Test
    void should_be_jasmine_flower_when_region_is_west_bengal() {
        Region region = new WestBengal();
        Flower flower = region.yourNationalFlower();

        String result = flower.whatsYourName();

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Jasmine");
    }

    @Test
    void should_be_lily_flower_when_region_is_andhra_pradesh() {
        Region region = new AndhraPradesh();
        Flower flower = region.yourNationalFlower();

        String result = flower.whatsYourName();

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Lily");
    }

    @Test
    void should_have_several_names_when_other_region() {
        Region region = new Region();
        Flower flower = region.yourNationalFlower();

        String result = flower.whatsYourName();

        assertThat(result)
                .isNotBlank()
                .isEqualTo("I have many names and types.");
    }

}
