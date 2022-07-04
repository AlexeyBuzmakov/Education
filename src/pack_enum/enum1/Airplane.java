package pack_enum.enum1;

public class Airplane {
    private String name;
    private double speed;
    private MotionState motionState;

    public Airplane(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public MotionState getMotionState() {
        return motionState;
    }

    public void setMotionState(MotionState motionState) {
        this.motionState = motionState;
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

    public MotionState motionStateDetection(String state) {
        switch(state) {
            case "Parking" -> {return MotionState.PARKING;}
            case "Takeoff" -> {return MotionState.TAKEOFF;}
            case "Flight" -> {return MotionState.FLIGHT;}
            case "Landing" -> {return MotionState.LANDING;}
        }
        return null;
    }
}
