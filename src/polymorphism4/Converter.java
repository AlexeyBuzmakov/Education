package polymorphism4;

public class Converter{

    public static double conversionCurrency(Currency currency) {
        return currency.conversion();
    }

    public Currency getCurrency(String chooseCurrency) {
        if(chooseCurrency.equals("Dollar")) {
           return new Dollar(120);
        }
        else if(chooseCurrency.equals("Euro")) {
            return new Euro(140);
        }
        else {
            System.out.println("Некоректный ввод");
        }

        return null;
    }
}
