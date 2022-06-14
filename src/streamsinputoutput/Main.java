package streamsinputoutput;

public class Main {
    public static void main(String[] args) {
        String str = "Russia";
        int[][]matrix = {{5, 12 , 13, 92}, {44, 31, 16, 28}, {13, 5, 66, 99}, {84, 17, 32, 55}};

//        Utils.inputOutputUsingByteStreams(str);
//        Utils.inputOutputUsingBufferedByteStreams(str);
//        Utils.inputOutputUsingCharacterStreams(str);
//        Utils.inputOutputUsingBufferedCharacterStreams(str);
//        Utils.inputOutputMatrix(matrix);
//        Utils.inputOutputStudents();
        Utils.sortingFileWordsIntoDifferentFiles();
    }
}
