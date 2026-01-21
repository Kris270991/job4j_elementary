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

}