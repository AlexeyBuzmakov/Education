package regularexpressions.matcherandpattern;

public class Main {
    public static void main(String[] args) {
        String str = "156.26.49.155";

        System.out.println(Utils.replaceNumbersWithLettersWayOne(str));
        System.out.println(Utils.replaceNumbersWithLettersWayTwo(str));
        Utils.getURLs(str);
        System.out.println(Utils.validatorIP(str));
        System.out.println(Utils.validatorPasswordStandard(str));
        System.out.println(Utils.validatorPasswordWithoutExclamationPoint(str));
        Utils.replaceDotsCommasNewlineCharacter(str);
    }
}
