package class_string;

public class Main {
    public static void main(String[] args) {
        String[]str = {"Document.txt", "Package", "Draft.txt", "Library.txt", "Files.txt", "Notes"};
        int[]arr = {1, 3, 5, 11, 27};
        UtilsString.iterationString("Welcome to Russia");
        UtilsString.splitString("filename.exe");
        UtilsString.outputArrayTxtElements(str);
        UtilsString.outputArrayWithoutTxtElements(str);
        UtilsString.createStringRepeatingElements();
        UtilsString.removeCertainArrayElements("123123123123123123123123123123123");
        UtilsString.convertIntArrayString(arr);
        UtilsString.sortStringAlphabetically("Hello", "Welcome", "GoodBye");
        UtilsString.countIdenticalElementString("What is your name", 'a');
        UtilsString.removeFirstGivenCharacters("333333111111", '3', 3);
        UtilsString.expandString("Great job");
        UtilsString.returnArrayWords("I Love Java");
    }
}
