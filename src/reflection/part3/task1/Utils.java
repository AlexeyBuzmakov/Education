package reflection.part3.task1;

import java.lang.reflect.Method;

public class Utils {
    public static <T> void fillObject(T obj, Object... args) throws Exception {
        Method[]methods = obj.getClass().getDeclaredMethods();
        int i = 0;
        for(Method method : methods) {
            if(method.getName().matches("set.*")) {
                method.invoke(obj, args[i]);
                i++;
            }
        }
    }
}

