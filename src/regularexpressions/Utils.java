package regularexpressions;

public class Utils {

    public static void fiveSymbols(String str) {
        String[]words = str.split(" +");
        for(String word : words) {
            if(word.matches(".{5}")) {
                System.out.print(word + " | ");
            }
        }
        System.out.println();
    }

    public static void twoFiveSymbols(String str) {
        String[]words = str.split(" +");
        for(String word : words) {
            if(word.matches(".{2,5}")) {
                System.out.print(word + " | ");
            }
        }
        System.out.println();
    }

    public static void fiveLatters(String str) {
        String[]words = str.split("\\W");
        for(String word : words) {
            if(word.matches("\\w{5}")) {
                System.out.print(word + " | ");
            }
        }
        System.out.println();
    }

    public static void numbers(String str) {
        String[]numbers = str.split(" +");
        for(String number : numbers) {
            if(number.matches("\\d+\\.?\\d*")) {
                System.out.print(number + " | ");
            }
        }
        System.out.println();
    }

    public static boolean validatorMail(String str) {
        return str.matches(".{1,10}@(g?mail|yandex)\\.ru");
    }

    public static void nonHyphen(String str) {
        String[]words = str.split(" +");
        for(String word : words) {
            if(word.matches("^-")) {
                System.out.print(word + " | ");
            }
        }
        System.out.println();
    }

    public void file(String str) {
        String[]words = str.split(" +");
        for(String word : words) {
            if(word.matches("(file|filwfad)\\.(exe|txt|zip)")) {
                System.out.println(word + " | ");
            }
        }
        System.out.println();
    }

    public static StringBuilder replaceNumbers(String str) {
        StringBuilder newStr = new StringBuilder();
        String[]words = str.split(" +");
        for(String word : words) {
            if(word.matches("\\d+\\.?\\d*")) {
               newStr.append("Цифра").append(" ");
               continue;
            }
            newStr.append(word).append(" ");
        }
        return newStr;
    }

    public static boolean validatorUrl(String str) {
        return str.matches("(https?|www)\\..+\\.(ru|com)");
    }

    public static boolean validatorBankCard(String str) {
        return str.matches("\\d{4} \\d{4} \\d{4} \\d{4}");
    }
}
