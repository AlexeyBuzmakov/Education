package collections.queue.task.queueshop;

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
        System.out.println(person);
        if(checkAge(person)) {
            checkQueue(person);
            arrayDeque.poll();
            return;
        }
        arrayDeque.offer(person);
        arrayDeque.poll();
    }

    private boolean checkAge(Person person) {
        return person.getAge() > 60;
    }

    private void checkQueue(Person person) {
        ArrayDeque<Person>newArrayDeque = new ArrayDeque<>();
        boolean flag = false;
        for(Person person1 : arrayDeque) {
            if(!flag) {
                if (person1.getAge() <= 60) {
                    newArrayDeque.offer(person);
                    flag = true;
                }
            }
            newArrayDeque.offer(person1);
        }
        arrayDeque = newArrayDeque;
    }

    private void printQueue() {
        System.out.println(arrayDeque);
    }
}
