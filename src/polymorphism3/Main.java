package polymorphism3;

public class Main{
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal fish = new Fish();
        Animal.say(fish);
    }
}
