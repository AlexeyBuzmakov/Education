package collections.map;

import collections.map.task.Person;

public class Main {
    public static void main(String[] args) {
        HashMap<Person, String>map = new HashMap<>();
        Person person1 = new Person("Sergey", 33);
        Person person2 = new Person("Vadim", 16);
        map.put(person1, "Doctor");
        map.put(person2, "Manager");
        System.out.println(map.get(person1));
        map.printMap();
    }
}
