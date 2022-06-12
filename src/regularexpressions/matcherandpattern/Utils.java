package regularexpressions.matcherandpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static String replaceNumbersWithLettersWayOne(String str) {
        return str.replaceAll("[-]?\\d+(.|,)?\\d*", "Цифра");
    }

    public static String replaceNumbersWithLettersWayTwo(String str) {
        Pattern pattern = Pattern.compile("[-]?\\d+(.|,)?\\d*");
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("Цифра");
    }

    public static void getURLs(String str) {
        Pattern pattern = Pattern.compile("https?://[^ ]+\\.(ru|com)");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static boolean validatorIP(String str) {
        return str.matches("[0-255]\\.[0-255]\\.[0-255]\\.[0-255]");
    }

    public static boolean validatorPasswordStandard(String str) {
        return str.matches("(?=.*\\d)+(?=.*([a-z]|[A-Z])+(?=.*[^\\w])+).{5,25}");
    }

    public static boolean validatorPasswordWithoutExclamationPoint(String str) {
        return str.matches("(?!.*!)(?=.*\\d)+(?=.*([a-z]|[A-Z])+(?=.*[^\\w])+).{5,25}");
    }

    public static void replaceDotsCommasNewlineCharacter(String str) {
        Pattern pattern = Pattern.compile("[.,]+");
        Matcher matcher = pattern.matcher(str);
        int count = 1;
        while(matcher.find()) {
            count++;
        }
        System.out.println(matcher.replaceAll("\n"));
        System.out.println("Количество строк - " + count);
    }
}
