package abstraction.abstraction2;

public class Euro extends Currency {

    public Euro(double rate) {
        super(rate);
    }

    @Override
    public double currencyConversion(int amountCurrency) {
        return getRate() * amountCurrency;
    }


}
