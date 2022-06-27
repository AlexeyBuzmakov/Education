package streamapi.part2;

import java.util.*;
import java.util.stream.IntStream;

public class Utils {
    public static Optional<Integer> getMax(List<Integer> list) {                                                   //1.1
        if (list.size() == 0) {
            return Optional.empty();
        }
        int max = Integer.MIN_VALUE;
        for(Integer num : list) {
            if(num > max) {
                max = num;
            }
        }
        return Optional.of(max);
        }

    public static Optional<Integer> getMin(List<Integer> list) {                                                   //1.2
        if (list.size() == 0) {
            return Optional.empty();
        }
        int min = Integer.MAX_VALUE;
        for(Integer num : list) {
            if(num < min) {
                min = num;
            }
        }
        return Optional.of(min);
    }

    public static Optional<Double> getAverage(List<Integer> list) {                                                //1.3
        if (list.size() == 0) {
            return Optional.empty();
        }
        double sum = 0;
        for(Integer num : list) {
            sum += num;
        }
        return Optional.of(sum/list.size());
    }

    public static boolean checkAgeAllUseStream(Person[]person) {                                                   //2.1
        return Arrays.stream(person)
                .allMatch(x -> x.getAge() >= 18);
    }

    public static boolean checkAgeAllUseCycle(Person[]persons) {                                                   //2.2
        for(Person person : persons) {
            if(person.getAge() < 18) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAgeOneUseStream(Person[]person) {                                                   //3.1
        return Arrays.stream(person)
                .anyMatch(x -> x.getAge() >= 18);
    }

    public static boolean checkAgeOneUseCycle(Person[]persons) {                                                   //3.2
        for(Person person : persons) {
            if(person.getAge() >= 18) {
                return true;
            }
        }
        return false;
    }

    public static void removeRepeat(List<Integer>list) {                                                           //4.1
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void removeRepeatTwo(List<Integer>list) {                                                        //4.2

    }

    public static void removeRepeatSorted(List<Integer>list) {                                                       //5

    }

    public static void sequenceGeneration() {                                                                        //6
        long sum = IntStream
                .iterate(new Random().nextInt(), x -> new Random().nextInt())
                .limit(10_000)
                .sum();
        double average = IntStream
                .iterate(new Random().nextInt(), x -> new Random().nextInt())
                .limit(10_000)
                .average()
                .getAsDouble();
        long countNumbersPositive = IntStream
                .iterate(new Random().nextInt(), x -> new Random().nextInt())
                .limit(10_000)
                .filter(x -> x >= 0)
                .count();
        long countNumbersNegative = IntStream
                .iterate(new Random().nextInt(), x -> new Random().nextInt())
                .limit(10_000)
                .filter(x -> x < 0)
                .count();
        System.out.println("sum: " + sum + " average: " + average + " countNumbersPositive :" +
                countNumbersPositive + " countNumbersNegative: " + countNumbersNegative);
    }
}

