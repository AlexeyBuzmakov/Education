package animalplanet;

public class Main {
    public static void main(String[] args) {
        Animal predator = new Predators(" P ",1,2);
        Animal herbivore = new Herbivores(" H ",100,2);
        Meat meat = new Meat(" M ", 100);
        Food grass = new Grass(" G ",1);
        Field.fieldInitialization();
        Food.appearanceObject(meat);
        Food.appearanceObject(grass);
        Animal.appearanceObject(predator);
        Animal.appearanceObject(herbivore);
        Animal.findEat(predator);
        Field.showGameField();
    }
}
