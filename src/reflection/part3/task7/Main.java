package reflection.part3.task7;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Person>persons = List.of(new Person("Alex", "Ivanov", 19, "Engineer"),
                new Person("Bob", "Makarov", 25, "Doctor"),
                new Person("Zina", "Lunina", 23, "Teacher"),
                new Person("Mariya", "Lysova", 37, "Translator"));
        Writer.write(persons);
    }
}
