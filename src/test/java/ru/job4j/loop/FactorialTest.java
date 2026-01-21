package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenFactorialNumber3ThenResult6() {
        int number = 3;
        int expected = 6;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFactorialNumber0ThenResult1() {
        int number = 0;
        int expected = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenFactorialNumber1ThenResult1() {
        int number = 1;
        int expected = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }
}