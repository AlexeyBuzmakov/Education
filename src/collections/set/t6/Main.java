package collections.set.t6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alexey", 20);
        Set<Person> set = new HashSet<>();
        set.add(person);
        person.setAge(33);
        System.out.println(set.contains(person));
    }
}
