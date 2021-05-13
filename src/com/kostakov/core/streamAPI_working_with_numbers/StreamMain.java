package com.kostakov.core.streamAPI_working_with_numbers;

import java.util.Comparator;
import java.util.List;

public class StreamMain {

    public static void filterStreamAPI(List<Integer> numbers) {
        System.out.println("Числа отфильтрованные с использованием Stream API:");
        numbers.stream()
                .filter(n -> n > 0)
                .filter(n -> n % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(n -> System.out.print(n + " / "));
        System.out.println();
    }
}
