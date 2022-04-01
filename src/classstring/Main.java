package classstring;

public class Main {
    public static void main(String[] args) {
        String[]str = {"Document.txt", "Package", "Draft.txt", "Library.txt", "Files.txt", "Notes"};
        UtilsString.iterationString("Welcome to Russia");
        UtilsString.splitString("filename.exe");
        UtilsString.outputArrayTxtElements(str);
        UtilsString.outputArrayWithoutTxtElements(str);
        UtilsString.createStringRepeatingElements();
        UtilsString.removeCertainArrayElements("123123123123123");
    }
}
