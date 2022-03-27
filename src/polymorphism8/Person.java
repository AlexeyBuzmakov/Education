package polymorphism8;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
        printInfo();
    }

    private void printInfo() {
        System.out.println(name.toUpperCase());
    }
}
