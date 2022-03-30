package abstraction.abstraction6;

class SpaceShip implements SpaceShipControls {
    private int speed;
    private int angle;

    @Override
    public void speedUp() {
        speed++;
    }

    public void speedDown() {
        speed--;
    }

    public void changeAngle(int angle) {
        this.angle = angle;
    }
}
