package regularexpressions;

public class Main {
    public static void main(String[] args) {
        String str = "4563 4657 0915 7638";

        Utils.fiveSymbols(str);
        Utils.twoFiveSymbols(str);
        Utils.fiveLatters(str);
        Utils.numbers(str);
        System.out.println(Utils.validatorMail(str));
        Utils.nonHyphen(str);
        System.out.println(Utils.replaceNumbers(str));
        System.out.println(Utils.validatorUrl(str));
        System.out.println(Utils.validatorBankCard(str));
    }
}
