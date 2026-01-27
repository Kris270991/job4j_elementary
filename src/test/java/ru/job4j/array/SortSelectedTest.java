package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenThreeElementsSort() {
        int[] data = new int[]{5, 8, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 5, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenFiveElementsSort() {
        int[] data = new int[]{10, 99, 5, 4, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 4, 5, 10, 99};
        assertThat(result).containsExactly(expected);
    }
}