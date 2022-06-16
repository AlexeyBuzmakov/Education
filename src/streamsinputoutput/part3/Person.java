package streamsinputoutput.part3;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -1012752872343897515L;

    private String name;
    private String surname;
    private int age;
    private String job;
    private String[]animals;

    public Person(String name, String surname, int age, String job, String[] animals) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String[] getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + job + " " + Arrays.toString(animals);
    }
}
