package packenum.enum1;

public class Airplane {
    private String name;
    private double speed;
    private MotionState state;

    public Airplane(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public MotionState getState() {
        return state;
    }

    public void setState(MotionState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
