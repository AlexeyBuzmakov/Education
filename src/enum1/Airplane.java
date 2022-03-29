package enum1;

public class Airplane {
    private MotionState state;
    private String name;
    private double speed;

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

    public Airplane(String name, double speed, MotionState state) {
        this.name = name;
        this.speed = speed;
        this.state = state;
    }
}
