package pt.caires.hackerrank.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckerTest {

    private Checker checker;

    @BeforeEach
    void setUp() {
        this.checker = new Checker();
    }

    @Test
    void should_return_negative_value_when_player1_has_higher_score() {
        Player player1 = new Player("mickey", 20);
        Player player2 = new Player("pluto", 10);

        int result = checker.compare(player1, player2);

        assertThat(result).isNegative();
    }

    @Test
    void should_return_positive_value_when_player1_has_lower_score() {
        Player player1 = new Player("mickey", 20);
        Player player2 = new Player("pluto", 30);

        int result = checker.compare(player1, player2);

        assertThat(result).isPositive();
    }

    @Test
    void should_return_positive_value_when_player1_has_same_score_but_higher_alphabetical_name() {
        Player player1 = new Player("pluto", 20);
        Player player2 = new Player("mickey", 20);

        int result = checker.compare(player1, player2);

        assertThat(result).isPositive();
    }

    @Test
    void should_return_negative_value_when_player1_has_same_score_but_lower_alphabetical_name() {
        Player player1 = new Player("donald", 20);
        Player player2 = new Player("mickey", 20);

        int result = checker.compare(player1, player2);

        assertThat(result).isNegative();
    }

    @Test
    void should_return_zero_when_player1_has_same_score_and_alphabetical_name() {
        Player player1 = new Player("mickey", 20);
        Player player2 = new Player("mickey", 20);

        int result = checker.compare(player1, player2);

        assertThat(result).isZero();
    }

}