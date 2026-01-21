package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart0Finish5TnanSum15() {
        int inputStart = 0;
        int inputFinish = 5;
        int expected = 15;
        int output = Counter.sum(inputStart, inputFinish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart5Finish0TnanSum0() {
        int inputStart = 5;
        int inputFinish = 0;
        int expected = 0;
        int output = Counter.sum(inputStart, inputFinish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus5Finish0TnanSumMinus15() {
        int inputStart = -5;
        int inputFinish = 0;
        int expected = -15;
        int output = Counter.sum(inputStart, inputFinish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFromZeroToTenThenSum30() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFromMinus5To0ThenSumMinus6() {
        int start = -5;
        int finish = 0;
        int expected = -6;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenFrom9To7ThenSum0() {
        int start = 9;
        int finish = 7;
        int expected = 0;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}