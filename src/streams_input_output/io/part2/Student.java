package streams_input_output.io.part2;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -1549538234452929253L;

    private String name;
    private String surname;
    transient private int[]grades;

    public Student(String name, String surname, int[] grades) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "name: " + name + " surname: " + surname + " grades: " + Arrays.toString(grades);
    }
}
