package streamapi.part3.task4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {

    public static Optional<String> getStrongestGroup(Map<String, List<Student>> groups) {                          //4.1
        return Stream.of(groups)
                .flatMap(x -> x.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue().stream()
                        .flatMap(y -> y.getMarks().values().stream())
                        .flatMap(Collection::stream)
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0)))
                .entrySet().stream()
                .sorted((o1, o2) -> Integer.compare((int) (o2.getValue() * 100), (int) (o1.getValue() * 100)))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public static Map<String, Double> getAverageMarkGroups(Map<String, List<Student>> groups) {                    //4.2
        return Stream.of(groups)
                .flatMap(x -> x.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue().stream()
                        .flatMapToInt(y -> y.getMarks().values().stream()
                                .flatMap(Collection::stream)
                                .mapToInt(z -> z))
                        .average()
                        .orElse(0.0)));
    }

    public static List<String> getListStudents(Map<String, List<Student>> groups) {                                //4.3
        return Stream.of(groups)
                .map(group -> group.values().stream()
                        .flatMap(Collection::stream)
                        .map(Student::getName))
                .map(Stream::toList)
                .flatMap(Collection::stream).toList();
    }

    public static List<Integer> getListMarks(Map<String, List<Student>> groups) {                                  //4.4
        return Stream.of(groups)
                .map(group -> group.values().stream()
                        .flatMap(Collection::stream)
                        .map(x -> x.getMarks().values())
                        .flatMap(Collection::stream))
                .map(Stream::toList)
                .flatMap(Collection::stream)
                .flatMap(Collection::stream).toList();
    }

    public static List<String> getListGroups(Map<String, List<Student>> groups) {                                  //4.5
        return Stream.of(groups)
                .map(x -> x.keySet().stream())
                .map(y -> y.sorted(Comparator.reverseOrder()))
                .map(Stream::toList)
                .flatMap(Collection::stream).toList();
    }

    public static Map<String, Boolean> checkAbsenceBehindGroups(Map<String, List<Student>> groups) {               //4.6
        return Stream.of(groups)
                .flatMap(x -> x.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        x -> x.getValue().stream()
                                .map(y -> y.getMarks().values().stream()
                                        .flatMap(Collection::stream))
                                .map(Stream::toList)
                                .flatMap(Collection::stream).toList()
                                .stream().allMatch(z -> z > 3)));
    }
}
