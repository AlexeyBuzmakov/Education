package abstraction10;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = human.create();
        System.out.println(human2.makeString());
        System.out.println(human.makeString());
        human.clear();
    }
}

