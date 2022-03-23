package polymorphism3;

public interface Animal {

    default void say(Animal animal) {

    }

    void say();
}
