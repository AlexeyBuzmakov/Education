package regular_expressions.matches;

public class Utils {

    public static void getWordsFromFiveSymbols(String str) {
        String[]words = str.split(" +");
        for(String word : words) {
            if(word.matches(".{5}")) {
                System.out.print(word + " | ");
            }
        }
        System.out.println();
    }

    public static void getWordsFromTwoToFiveSymbols(String str) {
        String[]words = str.split(" +");
        for(String word : words) {
            if(word.matches(".{2,5}")) {
                System.out.print(word + " | ");
            }
        }
        System.out.println();
    }

    public static void getWordsFromFiveLetters(String str) {
        String[]words = str.split(" +");
        for(String word : words) {
            if(word.matches("\\w{5}")) {
                System.out.print(word + " | ");
            }
        }
        System.out.println();
    }

    public static void getNumbers(String str) {
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

    public static void getWordsWithoutHyphen(String str) {
        String[]words = str.split(" +");
        for(String word : words) {
            if(word.matches("[^-]")) {
                System.out.print(word + " | ");
            }
        }
        System.out.println();
    }

    public static void getFilesName(String str) {
        String[]words = str.split(" +");
        for(String word : words) {
            if(word.matches("(file|filwfad)\\.(exe|txt|zip)")) {
                System.out.println(word + " | ");
            }
        }
        System.out.println();
    }

    public static String replaceNumbersWithLetters(String str) {
        return str.replaceAll("\\d+\\.?\\d*", "Цифра");
    }

    public static boolean validatorUrl(String str) {
        return str.matches("(https?|www)\\..+\\.(ru|com)");
    }

    public static boolean validatorBankCard(String str) {
        return str.matches("\\d{4} \\d{4} \\d{4} \\d{4}");
    }
}
