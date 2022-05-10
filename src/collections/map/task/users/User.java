package collections.map.task.users;

import java.util.Random;

public class User {
    private final String gender;
    private final int age;

    public User() {
        this.gender = generateGender();
        this.age = generateAge();
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    private String generateGender() {
        Random random = new Random();
        boolean gender = random.nextBoolean();
        if(gender) {
            return "male";
        }
        return "female";
    }

    private int generateAge() {
        return (int)(18 + Math.random() * 60);
    }

    @Override
    public String toString() {
        return "[gender:" + gender + " age:" + age + "]";
    }
}
