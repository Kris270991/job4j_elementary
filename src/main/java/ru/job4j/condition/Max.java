package ru.job4j.condition;

public class Max {
    public static int findMax(int a, int b, int c) {
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        return max;
    }

    public static int findMax(int a, int b, int c, int d) {
        int max = findMax(a, b, c) < d ? d : findMax(a, b, c);
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число: " + findMax(4, 8, 10));
        System.out.println("Максимальное число: " + findMax(9, 50, 2, 1));
    }
}
