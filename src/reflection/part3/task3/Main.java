package reflection.part3.task3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?>clazz = Utils.class;
        Field field = clazz.getDeclaredField("number");
        System.out.println(field.get(null));
        field.set(null, 50);
        System.out.println(field.get(null));
        Method method = clazz.getDeclaredMethod("getSum", int.class, int.class);
        Object sum = method.invoke(null, 5, 13);
        System.out.println(sum);
    }
}
