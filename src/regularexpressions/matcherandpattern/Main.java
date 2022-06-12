package regularexpressions.matcherandpattern;

public class Main {
    public static void main(String[] args) {
        String str = "Li515*. sfjsd!, fj23u2. fs23@";

        System.out.println(Utils.replaceNumbersWithLettersWayOne(str));
        System.out.println(Utils.replaceNumbersWithLettersWayTwo(str));
        Utils.getURLs(str);
        System.out.println(Utils.validatorIP(str));
        System.out.println(Utils.validatorPasswordStandard(str));
        System.out.println(Utils.validatorPasswordWithoutExclamationPoint(str));
        Utils.replaceDotsCommasNewlineCharacter(str);
    }
}
