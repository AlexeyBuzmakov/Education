package exception.exception8;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try{
            fileReader = new FileReader("file.txt");
        }
        catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            }
            catch (IOException ioException) {
                System.out.println(ioException.getMessage());
            }
        }
    }
}
