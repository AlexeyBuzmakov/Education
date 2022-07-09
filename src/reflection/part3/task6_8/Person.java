package reflection.part3.task6_8;

import java.time.LocalDate;
import java.time.LocalTime;

public class Person {
    private String name;
    private String surname;
    private int age;
    private LocalDate dateBirth;
    private LocalTime timeBirth;
    private Animal animal;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setTimeBirth(LocalTime timeBirth) {
        this.timeBirth = timeBirth;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Surname: " + surname + " Age: " + age + " DateBirth: "
                + dateBirth + " TimeBirth: " + timeBirth + " Animal: " + animal;
    }
}
