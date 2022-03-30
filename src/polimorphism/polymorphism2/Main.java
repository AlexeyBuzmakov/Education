package polimorphism.polymorphism2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Alex", 22);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите животное");
        String humanAnimal = scanner.nextLine();
        Animal animal = human.chooseAnimal(humanAnimal);
        human.setAnimal(animal);
        System.out.println(human);
        }
    }


