package collections.set.t1;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int[]grade;

    public Student(String name, int age, int[] grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Arrays.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age);
        result = 31 * result + Arrays.hashCode(grade);
        return result;
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age +
                " grades: " + Arrays.toString(grade);
    }
}
