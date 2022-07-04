package stream_api.part3.task2_3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student[]student = {new Student("Mike", Map.of(Student.SUBJECT[0], 5,
                                                              Student.SUBJECT[1], 4,
                                                              Student.SUBJECT[2], 4,
                                                              Student.SUBJECT[4], 3)),
                             new Student("Bob", Map.of(Student.SUBJECT[1], 4,
                                                              Student.SUBJECT[2], 3,
                                                              Student.SUBJECT[3], 3,
                                                              Student.SUBJECT[4], 5)),
                             new Student("Amanda", Map.of(Student.SUBJECT[0], 5,
                                                              Student.SUBJECT[2], 4,
                                                              Student.SUBJECT[3], 5,
                                                              Student.SUBJECT[4], 3))};

        System.out.println(Utils.getAverageMarkEachStudent(student));
        System.out.println(Utils.getAverageMarkEachSubject(student));

    }
}
