package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenPrefixEmptyThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenWordEmptyThenFalse() {
        char[] word = {};
        char[] prefix = {'H', 'e', 'l', 'l', 'o'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenWordAndPrefixEmptyThenFalse() {
        char[] word = {};
        char[] prefix = {};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }
}