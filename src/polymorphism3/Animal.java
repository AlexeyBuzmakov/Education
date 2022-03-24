package polymorphism3;

public interface Animal {

    static void say(Animal animal) {
        animal.say();
    }

    void say();
}
