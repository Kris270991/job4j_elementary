package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinTest {

    @Test
    void whenFirstMinThan1() {
        int[] array = new int[]{1, 5, 4, 7};
        int result = Min.findMin(array);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLastMinThan0() {
        int[] array = new int[]{2, 5, 7, 10, 0};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMiddleMinThen0() {
        int[] array = new int[]{1, 5, 7, 0, 4, 1};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}