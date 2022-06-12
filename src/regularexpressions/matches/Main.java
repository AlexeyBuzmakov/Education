package regularexpressions.matches;

public class Main {
    public static void main(String[] args) {
        String str = "4563 4657 0915 7638";

        Utils.getWordsFromFiveSymbols(str);
        Utils.getWordsFromTwoToFiveSymbols(str);
        Utils.getWordsFromFiveLetters(str);
        Utils.getNumbers(str);
        System.out.println(Utils.validatorMail(str));
        Utils.getWordsWithoutHyphen(str);
        Utils.getFilesName(str);
        System.out.println(Utils.replaceNumbersWithLetters(str));
        System.out.println(Utils.validatorUrl(str));
        System.out.println(Utils.validatorBankCard(str));
    }
}
