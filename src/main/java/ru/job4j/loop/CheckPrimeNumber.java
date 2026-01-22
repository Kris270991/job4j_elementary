package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean result = true;
        for (int index = 2; index <= number - 1; index++) {
            if (number % index == 0) {
                result = false;
                break;
            }
        }
        if (number == 1) {
            result = false;
        }
        return result;
    }
}