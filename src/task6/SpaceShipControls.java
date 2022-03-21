package task6;

public abstract class SpaceShipControls {
    private int speed;
    private int angle;

    public SpaceShipControls(int speed, int angle) {
        this.speed = speed;
        this.angle = angle;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAngle() {
        return angle;
    }

    public abstract void speedUp();

    public abstract void speedDown();

    public abstract void changeAngle();
}
