package polymorphism4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);
        String chooseObject = scanner.nextLine();
        Currency currency = converter.getCurrency(chooseObject);
        currency.setAmountCurrency(150);
        System.out.println(Converter.conversionCurrency(currency));
        }
    }

