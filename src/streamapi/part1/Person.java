package streamapi.part1;

import java.util.Arrays;

public class Person {
    private final int ID;
    private String name;
    private String surname;
    private String[]marks;

    public Person(int ID, String name, String surname, String[] marks) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " name: " + name + " surname: " + surname + " marks: " + Arrays.toString(marks);
    }
}
