package exception.exception8;

import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public FileReader reader(String fileName) throws IOException {
        return new FileReader(fileName);
    }
}
