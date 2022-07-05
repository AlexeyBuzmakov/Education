package reflection.part1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Student student = new Student("Mike", 22);                                                         //1
        Class<?>studentClass = student.getClass();

        Arrays.stream(studentClass.getMethods())                                                                     //2
                .forEach(x -> System.out.println("Class: " + x.getDeclaringClass() +
                        "\nMethod name: " + x.getName() +
                        "\nReturn type: " + x.getReturnType() +
                        "\nParameters: " + Arrays.toString(x.getParameterTypes())));

        long count = Arrays.stream(studentClass.getMethods())                                                        //3
                .filter(x -> !x.getReturnType().equals(Void.TYPE))
                .count();
        System.out.println(count);

        Method methodWithoutParam = studentClass.getDeclaredMethod("getName");                                 //4
        System.out.println(methodWithoutParam.invoke(student));

        Method methodWithParam = studentClass.getDeclaredMethod("setName", String.class);
        methodWithParam.invoke(student, "Bob");

        Method privateMethod = studentClass.getDeclaredMethod("setAge", int.class);                            //5
        privateMethod.setAccessible(true);
        privateMethod.invoke(student, 99);
    }
}
