package abstraction.abstraction5;

public class Person implements Moveable, Jumpable{
    private double speed;

    public Person(double speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        if(speed <= 0) {
            speed = SPEED;
        }
        System.out.println("Человек идёт со скоростью " + speed + " км/ч.");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }
}
