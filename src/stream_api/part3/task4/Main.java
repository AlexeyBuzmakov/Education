package stream_api.part3.task4;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", Map.of("math", List.of(5, 4, 5, 3, 5),
                "geometry", List.of(4, 3, 5, 4, 3),
                "philosophy", List.of(5, 4, 5, 4, 4)));
        Student student2 = new Student("Alex", Map.of("math", List.of(4, 5, 4, 5, 4),
                "geometry", List.of(4, 5, 4, 4, 5),
                "philosophy", List.of(5, 4, 5, 5, 4)));
        Student student3 = new Student("Jessica", Map.of("math", List.of(4, 5, 4, 3, 4),
                "geometry", List.of(3, 3, 4, 3, 5),
                "philosophy", List.of(5, 4, 3, 5, 4)));
        Student student4 = new Student("Patrick", Map.of("math", List.of(4, 4, 3, 5, 4),
                "geometry", List.of(3, 5, 4, 3, 5),
                "philosophy", List.of(4, 4, 5, 5, 3)));
        Student student5 = new Student("Arnold", Map.of("math", List.of(4, 5, 4, 3, 4),
                "geometry", List.of(3, 5, 3, 3, 4),
                "philosophy", List.of(4, 4, 5, 3, 4)));
        Student student6 = new Student("Amanda", Map.of("math", List.of(5, 4, 4, 5, 4),
                "geometry", List.of(5, 3, 5, 4, 5),
                "philosophy", List.of(4, 4, 5, 5, 4)));
        Student student7 = new Student("Jessica", Map.of("math", List.of(5, 5, 4, 4, 4),
                "geometry", List.of(4, 5, 4, 4, 4),
                "philosophy", List.of(4, 4, 5, 5, 4)));
        Student student8 = new Student("Jacob", Map.of("math", List.of(5, 5, 5, 4, 4),
                "geometry", List.of(5, 5, 4, 4, 5),
                "philosophy", List.of(5, 4, 4, 5, 4)));
        Student student9 = new Student("Bella", Map.of("math", List.of(4, 5, 5, 4, 4),
                "geometry", List.of(4, 5, 4, 4, 5),
                "philosophy", List.of(5, 4, 5, 5, 4)));

        List<Student> listBuilders = List.of(student1, student2, student3);
        List<Student> listProgrammers = List.of(student4, student5, student6);
        List<Student> listLinguists = List.of(student7, student8, student9);

        Group builder = new Group("Builders", listBuilders);
        Group programmer = new Group("Programmers", listProgrammers);
        Group linguist = new Group("Linguists", listLinguists);

        Map<String, List<Student>> groups = Map.of(builder.getName(), builder.getStudents(),
                programmer.getName(), programmer.getStudents(),
                linguist.getName(), linguist.getStudents());

        System.out.println(Utils.getStrongestGroup(groups));
        System.out.println(Utils.getAverageMarkGroups(groups));
        System.out.println(Utils.getListStudents(groups));
        System.out.println(Utils.getListMarks(groups));
        System.out.println(Utils.getListGroups(groups));
        System.out.println(Utils.checkAbsenceBehindGroups(groups));
    }
}
