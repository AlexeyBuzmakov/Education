package reflection.part3.task2;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Field[] fields = doctor.getClass().getSuperclass().getSuperclass().getDeclaredFields();
        Arrays.stream(fields)
                .peek(x -> x.setAccessible(true))
                .forEach(x -> {
                    try {
                        System.out.println(x.get(doctor));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
    }
}
