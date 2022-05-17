package collections.set.t1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vladimir", 18, new int[]{4, 3, 5, 4, 3, 5});
        Student student2 = new Student("Sergey", 19, new int[]{5, 4, 5, 4, 3, 5});
        Student student3 = new Student("Mihail", 21, new int[]{3, 3, 5, 3, 3, 4});
        Student student4 = new Student("Petr", 20, new int[]{4, 4, 5, 5, 4, 5});
        Student student5 = new Student("Sergey", 19, new int[]{5, 4, 5, 4, 3, 5});

        Set<Student>students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for(Student student : students) {
            System.out.println(student);
        }
    }
}
