package streamapi.part3.task2_3;

import java.util.Map;

public class Student {
    public static final String[]SUBJECT = {"Biology", "Chemistry", "Mathematics", "History", "Geography"};
    private String name;
    private Map<String, Integer> marks;

    public Student(String name, Map<String, Integer> grades) {
        this.name = name;
        this.marks = grades;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }
}
