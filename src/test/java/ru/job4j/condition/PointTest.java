package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoint12And34ThenDistance2dot8() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        double expected = 2.8;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenPointMinus12And34ThenDistance7dot2() {
        int x1 = -1, y1 = -2, x2 = 3, y2 = 4;
        double expected = 7.2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenPoint2Minus10And34ThenDistance14() {
        int x1 = 2, y1 = -10, x2 = 3, y2 = 4;
        double expected = 14;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }
}