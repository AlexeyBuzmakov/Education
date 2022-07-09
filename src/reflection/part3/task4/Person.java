package reflection.part3.task4;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String job;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, String job) {
        this.name = name;
        this.surname = surname;
        this.job = job;
    }
}
