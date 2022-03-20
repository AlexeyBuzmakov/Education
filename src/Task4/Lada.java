package Task4;

class Lada extends Car{

    public Lada(int speed, double fuelConsumption, int breakageProbability, int fuelQuantity) {
        super(speed, fuelConsumption, breakageProbability, fuelQuantity);
    }

    @Override
    public void numberMovesFinish() {
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
        System.out.println("Lada проехала трассу за " + n + " ходов.");
    }
}
