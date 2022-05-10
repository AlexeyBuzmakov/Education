package collections.queue.task.queueatm;

import java.util.Random;

public class Person {
    private String gender;
    private int age;

    public Person() {
        this.gender = gender();
        this.age = (int) (20 + Math.random() * 60);
    }

    public int getAge() {
        return age;
    }

    private String gender() {
        Random random = new Random();
        boolean gender = random.nextBoolean();
        if(gender) {
            return "Male";
        }
        return "Female";
    }

    @Override
    public String toString() {
        return gender + " " + age;
    }
}
