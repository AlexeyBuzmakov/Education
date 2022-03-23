package polymorphism2;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Alex", 19, "Animal");
        human.definitionAnimal("Tiger");
        System.out.println(human.toString());
    }
}
