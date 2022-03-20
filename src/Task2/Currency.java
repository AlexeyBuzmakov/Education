package Task2;

public abstract class Currency {
    private double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if(rate > 0) {
            this.rate = rate;
        }
    }

    public Currency(double rate) {
        this.rate = rate;
    }

    public abstract double currencyConversion(int amountCurrency);
}
