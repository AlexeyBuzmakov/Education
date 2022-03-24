package abstraction5;

public interface Moveable {
    double SPEED = 7.5;

    default void move() {
        System.out.println("Человек идёт со скоростью " + SPEED + " км/ч.");
    }
}
