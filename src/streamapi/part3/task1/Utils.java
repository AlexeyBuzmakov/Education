package streamapi.part3.task1;

import java.util.*;
import java.util.stream.Collectors;

public class Utils {
    public static Map<String, Double> getAverageMarkSubjectsEachStudents(Student[] students) {                     //1.1
        return Arrays.stream(students)
                .collect(Collectors.toMap(Student::getName,
                        student -> student.getMarks().values().stream()
                                .flatMap(Collection::stream)
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0)));
    }

    public static Map<String, Double> getOverallAverageMarkEachSubject(Student[] students) {                       //1.2
        return Arrays.stream(students)
                .flatMap(student -> student.getMarks().entrySet().stream())
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.averagingDouble(entry -> entry.getValue().stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0))));
    }

    public static Double getOverallAverageMark(Student[] students) {                                               //1.3
        return Arrays.stream(students)
                .flatMap(student -> student.getMarks().values().stream())
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public static Map<String, String> getFeedbackStudentStudies(Student[] students) {                             //1.4
        return Arrays.stream(students)
                .collect(Collectors.toMap(Student::getName,
                        student -> student.getMarks().values().stream()
                                .flatMap(Collection::stream)
                                .mapToInt(Integer::intValue)
                                .sum()))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue().toString()))
                .entrySet().stream()
                .takeWhile(x -> Integer.parseInt(x.getValue()) >= 65 || x.getValue().equals("Good"))
                .collect(Collectors.toMap(Map.Entry::getKey, x -> "Good"));

    }

    public static Optional<String> easiestSubject(Student[] students) {                                            //1.5
        return Arrays.stream(students)
                .flatMap(student -> student.getMarks().entrySet().stream())
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.averagingDouble(entry -> entry.getValue().stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0))))
                .entrySet().stream()
                .sorted((o1, o2) -> Integer.compare((int) (o2.getValue() * 100), (int) (o1.getValue() * 100)))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public static Optional<String> getSmartestStudent(Student[] students) {                                        //1.6
        return Arrays.stream(students)
                .collect(Collectors.toMap(Student::getName,
                        student -> student.getMarks().values().stream()
                                .flatMap(Collection::stream)
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0)))
                .entrySet().stream()
                .sorted((o1, o2) -> Integer.compare((int) (o2.getValue() * 100), (int) (o1.getValue() * 100)))
                .map(Map.Entry::getKey)
                .findFirst();
    }
}
