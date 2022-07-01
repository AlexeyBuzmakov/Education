package streamapi.part3.task2_3;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Utils {
    public static Map<String, Double> getAverageMarkEachStudent(Student[] students) {                                //2
        return Arrays.stream(students)
                .collect(Collectors.toMap(Student::getName,
                        student -> student.getMarks().values().stream()
                                .mapToInt(Integer::intValue)
                                .sum()))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue() / (double) Student.SUBJECT.length));
    }

    public static Map<String, Double> getAverageMarkEachSubject(Student[] students) {                                //3
        return Arrays.stream(students)
                .flatMap(student -> student.getMarks().entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.summingInt(Map.Entry::getValue)))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue() / (double) students.length));
    }


}
