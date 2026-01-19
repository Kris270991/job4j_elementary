package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength7AndWidth10diagonal12dot2() {
        double lenght = 7, width = 10;
        double expected = 12.2;
        double output = Rectangle.diagonal(lenght, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength3dot5AndWidth6diagonal12dot2() {
        double lenght = 3.5, width = 6;
        double expected = 6.94;
        double output = Rectangle.diagonal(lenght, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength3AndWidth4diagonal5() {
        double lenght = 3, width = 4;
        double expected = 5;
        double output = Rectangle.diagonal(lenght, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}