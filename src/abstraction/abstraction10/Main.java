package abstraction.abstraction10;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob", 19);
        person.setName("Alex");
        person.setAge(22);
        Person person1 = person.createObject();
        person1.clear();
        System.out.println(person1.makeString());
    }
}
