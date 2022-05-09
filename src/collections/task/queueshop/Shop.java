package collections.task.queueshop;

import java.util.ArrayDeque;

public class Shop {
    ArrayDeque<Person> arrayDeque = new ArrayDeque<>();

    public void start() {
        createStack();
        int count = 0;
        while(count < 50) {
            queueMove();
            printQueue();
            count++;
        }
    }

    private void createStack() {
        int count = 0;
        while(count < 10) {
            arrayDeque.offer(new Person());
            count++;
        }
    }

    private void queueMove() {
        Person person = new Person();
        if(checkAge(person)) {
            arrayDeque.addFirst(person);
            arrayDeque.poll();
            return;
        }
        arrayDeque.offer(person);
        arrayDeque.poll();

    }

    private boolean checkAge(Person person) {
        return person.getAge() > 60;
    }

    private void printQueue() {
        System.out.println(arrayDeque);
    }
}
