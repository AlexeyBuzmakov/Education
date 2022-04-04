package exception.exception6;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Files files = new Files();
        FileWriter file = files.create("file.txt");
    }


}
