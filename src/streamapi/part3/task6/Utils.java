package streamapi.part3.task6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utils {

    public static void sort(int[] arr) {
        long start = System.nanoTime();
        Arrays.stream(arr)
                .sorted();
        long end = System.nanoTime();
        long withoutParallelStream = end - start;

        start = System.nanoTime();
        Arrays.stream(arr)
                .parallel()
                .sorted();
        end = System.nanoTime();
        long withParallelStream = end - start;

        System.out.println("Sort without using parallel stream: " + withoutParallelStream / 1_000_000.0 + " ms\n" +
                "Sort with using parallel stream: " + withParallelStream / 1_000_000.0 + " ms");
    }

    public static void addition(int[] arr) {
        long start = System.nanoTime();
        Arrays.stream(arr)
                .sum();
        long end = System.nanoTime();
        long withoutParallelStream = end - start;

        start = System.nanoTime();
        Arrays.stream(arr)
                .parallel()
                .sum();
        end = System.nanoTime();
        long withParallelStream = end - start;

        System.out.println("Addition without using parallel stream: " + withoutParallelStream / 1_000_000.0 + " ms\n" +
                "Addition with using parallel stream: " + withParallelStream / 1_000_000.0 + " ms");
    }

    public static void grouping(List<Car> list) {
        long start = System.nanoTime();
        Map<String, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(Car::getBrand, Collectors.toList()))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue().stream()
                        .map(Car::getModel).toList()));
        long end = System.nanoTime();
        long withoutParallelStream = end - start;

        start = System.nanoTime();
        Map<String, List<String>> map2 = list.stream()
                .parallel()
                .collect(Collectors.groupingBy(Car::getBrand, Collectors.toList()))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue().stream()
                        .map(Car::getModel).toList()));
        end = System.nanoTime();
        long withParallelStream = end - start;

        System.out.println("Grouping without using parallel stream: " + withoutParallelStream / 1_000_000.0 + " ms\n" +
                "Grouping with using parallel stream: " + withParallelStream / 1_000_000.0 + " ms");
    }
}

