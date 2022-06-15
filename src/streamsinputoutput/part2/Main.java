package streamsinputoutput.part2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", 22);
        Person person2 = new Person("Jessica", 17);
        Person person3 = new Person("Pol", 22);

        Person[]persons = {new Person("Mike", 15),
                           new Person("John", 27),
                           new Person("Brain", 31),
                           new Person("Samanta", 25)};

        Student[]students = {new Student("Mariya", "Voronina", new int[]{5, 4, 5, 3, 5, 5}),
                             new Student("Ivan", "Danilov", new int[]{3, 4, 3, 5, 4, 4, 3}),
                             new Student("Maxim", "Kiselev", new int[]{5, 5, 4, 5, 4, 4, 3}),
                             new Student("Tamara", "Lobova", new int[]{5, 3, 4, 5, 3, 4, 4})};

        Utils.serializationDesirializationObject(person1);
        Utils.serializationDesirializationObject(person2);
        Utils.serializationDesirializationObject(person3);
        Utils.serializationDesirializationArrayObjects(persons);
        Utils.serializationDesirializationArrayObjects(students);
    }
}
