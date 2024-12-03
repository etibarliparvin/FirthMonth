package com.faang.reverse;

import java.util.List;

public class Example {

    public static void reverse(List<Integer> numbers) {
        int size = numbers.size();
        for (int i = 0; i < size / 2; i++) {
            Integer temp = numbers.get(i);
            numbers.set(i, numbers.get(size - i - 1));
            numbers.set(size - i - 1, temp);
        }
    }

}
