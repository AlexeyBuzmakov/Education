package lambda.part1;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private String job;

    public Employee(String name, String surname, int age, String job) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
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
}
