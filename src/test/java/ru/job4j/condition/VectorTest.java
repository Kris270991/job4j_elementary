package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class VectorTest {

    @Test
    void whenWektors12And34ThenResult46() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        String expected = "(4, 6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenWektorsMinus12And34Result22() {
        int x1 = -1, y1 = -2, x2 = 3, y2 = 4;
        String expected = "(2, 2)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenWektorsMinus12AndMinus34ResultMinus46() {
        int x1 = -1, y1 = -2, x2 = -3, y2 = -4;
        String expected = "(-4, -6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}
