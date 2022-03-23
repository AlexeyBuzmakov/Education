package abstraction2;

public class Dollar extends Currency {

    public Dollar(double rate) {
        super(rate);
    }

    @Override
    public double currencyConversion(int amountCurrency) {
        return getRate() * amountCurrency;
    }
}
