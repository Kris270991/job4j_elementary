package ru.job4j.calculator;

public class Fit {
    public static double manWeght(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeght(height);
        System.out.println("Man 187 cm is " + man + "kg");
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 187 cm is " + woman + "kg");
    }
}

