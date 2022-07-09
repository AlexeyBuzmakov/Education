package reflection.part3.task7;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Writer {
    public static <T> void write(List<T> list) throws IOException {
        if (list.size() != 0) {
            String headers = Arrays.stream(list.get(0).getClass().getDeclaredFields())
                    .map(Field::getName)
                    .map(x -> x.replace(x.substring(0, 1), x.substring(0, 1).toUpperCase()))
                    .collect(Collectors.joining(" "));
            Files.writeString(Paths.get("Test.txt"), headers);

            for (T element : list) {
                String line = Arrays.stream(element.getClass().getDeclaredFields())
                        .peek(x -> x.setAccessible(true))
                        .map(x -> {
                            try {
                                return x.get(element).toString();
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                        .collect(Collectors.joining(" "));
                Files.writeString(Paths.get("Test.txt"), "\n" + line, StandardOpenOption.APPEND);
            }
        }
    }
}
