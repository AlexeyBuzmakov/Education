package Task4;

public abstract class Car {
    private int speed;
    private double fuelConsumption;
    private int breakageProbability;
    private int fuelQuantity;

    public Car(int speed, double fuelConsumption, int breakageProbability, int fuelQuantity) {
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.breakageProbability = breakageProbability;
        this.fuelQuantity = fuelQuantity;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getBreakageProbability() {
        return breakageProbability;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public abstract void numberMovesFinish();
}
