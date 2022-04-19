package generics.generics3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(30);
        Person person2 = new Person(20);
        Person person3 = new Person(10);

        Utils<Person>utils = new Utils<>();
        ArrayList<Person>list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        utils.sort(list);
    }
}
