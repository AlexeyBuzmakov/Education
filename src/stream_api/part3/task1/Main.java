package stream_api.part3.task1;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student[]student = {new Student("Bob", Map.of("math", List.of(5, 4, 5, 3, 5),
                                                    "geometry", List.of(4, 3, 5, 4, 3),
                                                    "philosophy", List.of(5, 4, 5, 4, 4))),
                new Student("Alex", Map.of("math", List.of(4, 5, 4, 5, 4),
                                                     "geometry", List.of(4, 5, 4, 4, 5),
                                                     "philosophy", List.of(5, 4, 5, 5, 4))),
                new Student("Jessica", Map.of("math", List.of(4, 5, 4, 3, 4),
                                                     "geometry", List.of(3, 3, 4, 3, 5),
                                                     "philosophy", List.of(5, 4, 3, 5, 4)))};

//        System.out.println(Utils.getAverageMarkSubjectsEachStudents(student));
//        System.out.println(Utils.getOverallAverageMarkEachSubject(student));
//        System.out.println(Utils.getOverallAverageMark(student));
        System.out.println(Utils.getFeedbackStudentStudies(student));
//        System.out.println("Самый лёгкий предмет - " + Utils.easiestSubject(student));
//        System.out.println("Самый умный студент - " + Utils.getSmartestStudent(student));
    }
}
