package streamapi.part3.task4;

import java.util.List;

public class Group {
    private String name;
    private List<Student>students;

    public Group(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }
}
