package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoint12And34ThenDistance2dot8() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double expected = 2.8;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenPointMinus12And34ThenDistance7dot2() {
        Point a = new Point(-1, -2);
        Point b = new Point(3, 4);
        double expected = 7.2;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenPoint2Minus10And34ThenDistance14() {
        Point a = new Point(2, -10);
        Point b = new Point(3, 4);
        double expected = 14;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }
}