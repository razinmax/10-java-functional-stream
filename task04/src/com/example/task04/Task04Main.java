package com.example.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Task04Main {
    public static void main(String[] args) {
        String result = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))
                .lines()
                .flatMap(line -> Arrays.stream(line.toLowerCase().split("[^\\p{L}\\p{Nd}]+")))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Long>>comparingLong(Map.Entry::getValue)
                        .reversed()
                        .thenComparing(Map.Entry::getKey))
                .limit(10)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining("\n"));

        System.out.print(result + "\n"); // Явно добавляем \n для совместимости
    }
}
