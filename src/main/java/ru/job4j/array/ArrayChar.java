package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        if (word.length < prefix.length || prefix.length == 0) {
            result = false;
        } else {
            for (int index = 0; index < prefix.length; index++) {
                if (prefix[index] != word[index]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
