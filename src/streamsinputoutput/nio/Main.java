package streamsinputoutput.nio;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, "JavaScript");
        map.put(3, "Python");
        map.put(4, "Swift");
        map.put(5, "Kotlin");

        int[][]matrix = {{5, 16, 93, 12}, {44, 81, 36, 18}, {11, 53, 27, 84}, {16, 5, 48, 72}};

        String str1 = "Moscow";
        String str2 = "Tyumen";

        Utils.writeReadUsedInputOutputStreams(map);
        Utils.writeReadUsedClassFiles(map);
        Utils.copyMoveFiles();
        Utils.writeReadMatrixUsedClassFiles(matrix);
        Utils.addingRowsUsedInputOutputStreams(str1, str2);
        Utils.addingRowsUsedClassFiles(str1, str2);
        Utils.createFileWithAutoExclusion();
        Utils.editSequenceNumbers();

    }
}
