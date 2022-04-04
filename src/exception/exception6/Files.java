package exception.exception6;

import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public FileWriter create(String fileName) throws IOException {
        if(fileName == null) {

        }
        return new FileWriter(fileName);
    }
}
