package generics.generics3.task2;

import java.util.Comparator;

public class ComparePerson implements Comparator<Person> {

    @Override
    public int compare(Person age1, Person age2) {
        return Integer.compare(age1.getAge(), age2.getAge());
    }
}
