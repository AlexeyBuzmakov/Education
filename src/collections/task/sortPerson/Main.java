package collections.task.sortPerson;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ecaterina", "Babaeva");
        Person person2 = new Person("Anton", "Costromin");
        Person person3 = new Person("Alexandr", "Bespovorotny");

        Queue<Person>queueAlphabeticaly = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        queueAlphabeticaly.add(person1);
        queueAlphabeticaly.add(person2);
        queueAlphabeticaly.add(person3);

        Queue<Person>queueLenghtLine = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.toString().length() - o2.toString().length();
            }
        });

        queueLenghtLine.add(person1);
        queueLenghtLine.add(person2);
        queueLenghtLine.add(person3);

        Utils.printQueue(queueAlphabeticaly);
        Utils.printQueue(queueLenghtLine);
    }
}
