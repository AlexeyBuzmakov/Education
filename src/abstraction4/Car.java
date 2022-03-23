package abstraction4;

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

    public int startRace() {
            int n = 0;
            double distanceTraveled = 0;
            double remainingFuel = getFuelQuantity();
            boolean checkBreakage;
            while(distanceTraveled <= 1000) {
                n++;
                distanceTraveled += getSpeed();
                remainingFuel -= ((double) getSpeed() / 100 * getFuelConsumption());
                if(remainingFuel <= 0) {
                    remainingFuel = getFuelQuantity();
                    n++;
                }
                checkBreakage = getBreakageProbability() < Math.random() * 100;
                if(checkBreakage) {
                    n++;
                }
            }
            return n;
        }
    }

