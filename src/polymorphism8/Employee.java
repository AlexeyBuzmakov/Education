package polymorphism8;

public class Employee extends Person {
    String job;

    public Employee(String name, String job) {
        super(name);
        this.job = job;
    }

    public void printInfo() {
        System.out.println(name.toUpperCase() + " " + job.toUpperCase());
    }
}
