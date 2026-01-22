package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        boolean check = true;
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            for (int index = 2; index <= number - 1; index++) {
                check = true;
                if (number % index == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
            }
        }
        return count;
    }
}
