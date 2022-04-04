package animalplanet;

public class Main {
    public static void main(String[] args) {
        Animal predator = new Predators(2,'P');
        Animal herbivore = new Herbivores(3,'H');
        Food meat = new Meat(5,'M');
        Food grass = new Grass(3,'G');
        Food.appearanceFood(meat);
        Food.appearanceFood(grass);
        Animal.appearanceAnimal(predator);
        Animal.appearanceAnimal(herbivore);
        Field.showGameField();
    }
}
