package polymorphism2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Alex", 19, " ");
        human.definitionAnimal();
        System.out.println(human.toString());
    }
}
