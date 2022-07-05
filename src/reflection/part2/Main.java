package reflection.part2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Student> methodClass = Student.class;
        Student student = new Student("Mike");

        Method method = methodClass.getDeclaredMethod("getObject", Object.class);

        String className = Arrays.toString(method.getParameterTypes());                                              //2
        System.out.println("Class name: " + className);

        Method[] methods = method.getParameterTypes().getClass().getMethods();
        Arrays.stream(methods)
                .forEach(x -> System.out.println(x.getName()));

        boolean equals = false;                                                                                      //3
        for (Method method1 : methods) {
            if (method1.getName().equals("equals")) {
                equals = (boolean) method1.invoke(student, student);
            }
        }
        System.out.println(equals);

        long countPublicMethods = Arrays.stream(methods)                                                             //4
                .filter(x -> x.getModifiers() != Modifier.PUBLIC)
                .count();
        System.out.println(countPublicMethods);

        long countNotPublicMethods = Arrays.stream(methods)                                                          //5
                .filter(x -> x.getModifiers() == Modifier.PUBLIC)
                .count();
        System.out.println(countNotPublicMethods);
    }
}

