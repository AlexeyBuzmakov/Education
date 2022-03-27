package polymorphism4;

public abstract class Currency {
    private double rate;
    private int amountCurrency;

    public Currency(double rate) {
        this.rate = rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setAmountCurrency(int amountCurrency) {
        this.amountCurrency = amountCurrency;
    }

    public double conversion() {
        return rate * amountCurrency;
    }
}
