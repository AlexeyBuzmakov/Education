package task6;

class SpaceShip extends SpaceShipControls {

    public SpaceShip(int speed, int angle) {
        super(speed, angle);
    }

    @Override
    public void speedUp() {
        System.out.println("Увеличить скорость.");
    }

    public void speedDown() {
        System.out.println("Уменшить скорость.");
    }

    public void changeAngle() {
        System.out.println("Изменить угол полёта.");
    }
}
