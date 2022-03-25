package abstraction10;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob", 19);
        person.setName("Alex");
        person.setAge(22);
        person.createObject();
        person.clear();
        System.out.println(person.makeString());
    }
}
