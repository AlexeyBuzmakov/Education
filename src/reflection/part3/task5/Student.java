package reflection.part3.task5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Student {
    @MyAnnotation(name = "Alex")
    private final String name;
    @MyAnnotation(age = 19)
    private final int age;
    @MyAnnotation(marks = {5, 4, 5, 3, 5})
    private final List<Integer> marks;

    public Student() throws NoSuchFieldException {
        name = getName();
        age = getAge();
        marks = getMarks();
    }


    Method[]anno = MyAnnotation.class.getDeclaredMethods();

    private String getName() throws NoSuchFieldException {
        Field fieldName = Student.class.getDeclaredField("name");
        if(fieldName.isAnnotationPresent(MyAnnotation.class)) {
            for (Method field : anno) {
                if (field.getName().equals("name")) {
                    return fieldName.getDeclaredAnnotation(MyAnnotation.class).name();
                }
            }
        }
        return null;
    }

    private int getAge() throws NoSuchFieldException {
        Field fieldAge = Student.class.getDeclaredField("age");
        if(fieldAge.isAnnotationPresent(MyAnnotation.class)) {
            for (Method field : anno) {
                if (field.getName().equals("age")) {
                    return fieldAge.getAnnotation(MyAnnotation.class).age();
                }
            }
        }
        return 0;
    }

    private List<Integer> getMarks() throws NoSuchFieldException {
        Field fieldMarks = Student.class.getDeclaredField("marks");
        if(fieldMarks.isAnnotationPresent(MyAnnotation.class)) {
            for (Method field : anno) {
                if (field.getName().equals("marks")) {
                    return Arrays.stream(fieldMarks.getAnnotation(MyAnnotation.class).marks()).boxed().toList();
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}
