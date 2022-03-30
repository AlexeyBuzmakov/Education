package polimorphism.polymorphism2;

public class Human {
    private String name;
    private int age;
    private Animal animal;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal chooseAnimal(String humanAnimal) {
        switch(humanAnimal) {
            case "Dog" -> {return new Dog();}
            case "Cat" -> {return new Cat();}
            case "Fish" -> {return new Fish();}
            default -> System.out.println("Некоректный ввод");
        }
        return null;
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
