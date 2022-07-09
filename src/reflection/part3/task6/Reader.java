package reflection.part3.task6;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static<T> List<T> read(String fileName, Class<T>clazz) throws Exception {
        List<T>objects = new ArrayList<>();
        List<String> list = Files.readAllLines(Paths.get(fileName));
        String[]headers = list.get(0).split(" +");
        for(int j = 1; j < list.size(); j++) {
            T object = clazz.getDeclaredConstructor().newInstance();
            String[]elements = list.get(j).split(" +");
            for (int i = 0; i < elements.length; i++) {
                String sym = headers[i].substring(0, 1);
                Field field = object.getClass().getDeclaredField(headers[i].replace(sym, sym.toLowerCase()));
                field.setAccessible(true);
                field.set(object, convert(field, elements[i]));
            }
            objects.add(object);
        }
        return objects;
    }

    private static<R> Object convert(Field field, String value) throws Exception {
        Class<?>clazz = field.getType();
        if(clazz == int.class) {
            return Integer.parseInt(value);
        }
        if(clazz == String.class) {
            return value;
        }
        if(clazz == LocalDate.class) {
            return LocalDate.parse(value);
        }
        if(clazz == LocalDateTime.class) {
            return LocalDateTime.parse(value);
        }
        if(clazz == LocalTime.class) {
            return LocalTime.parse(value);
        }
        if(clazz.isAnnotationPresent(MyAnnotation.class)) {
            @SuppressWarnings("unchecked")
            R object = (R)clazz.getDeclaredConstructor().newInstance();
            Field[]fields = object.getClass().getDeclaredFields();
            String[]elements = value.substring(1, value.length() - 1).split(" *,");
            for(int i = 0; i < elements.length; i++) {
                fields[i].setAccessible(true);
                fields[i].set(object, convert(fields[i], elements[i]));
            }
            return object;
        }
        return null;
    }
}
