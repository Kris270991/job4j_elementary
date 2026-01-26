package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean element : data) {
            boolean temp = data[0];
            if (element != temp) {
                result = false;
                break;
            }
        }
        return result;
    }
}
