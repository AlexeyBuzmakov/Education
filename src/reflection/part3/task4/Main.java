package reflection.part3.task4;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?>clazz = Person.class;

        Constructor<?>constructor1 = clazz.getDeclaredConstructor(String.class, String.class, int.class);
        Person person1 = (Person)constructor1.newInstance("Alex", "Grande", 22);

        Constructor<?>constructor2 = clazz.getDeclaredConstructor(String.class, String.class, String.class);
        Person person2 = (Person)constructor2.newInstance("Bob", "Morris", "Doctor");
    }
}
