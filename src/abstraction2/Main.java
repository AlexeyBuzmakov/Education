package abstraction2;

public class Main {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(110);
        Euro euro = new Euro(140);
        System.out.println(dollar.currencyConversion(200));
        System.out.println(euro.currencyConversion(200));
    }
}
