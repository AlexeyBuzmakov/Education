package polymorphism2;

import java.util.Scanner;

public class Human {
    private String name;
    private int age;
    private String animal;

    public Human(String name, int age, String animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    public void definitionAnimal(String animal) {
        switch(animal) {
            case "Dog":
                Animal dog = new Dog();
                break;
            case "Cat":
                Animal cat = new Cat();
                break;
            case "Fish":
                Animal fish = new Fish();
                break;
            default:
                System.out.println("Такого животного нет");
        }
        Human human = new Human(name, age, animal);
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal='" + animal + '\'' +
                '}';
    }
}
