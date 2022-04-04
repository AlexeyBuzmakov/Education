package exception.exception3;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
        if(name.equals("")) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        }
    }

    public void setAge(int age) {
        this.age = age;
        if(age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        }
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        if(age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        }
        if(name.equals("")) {
            throw new IllegalArgumentException("Поле <Имя> не может быть пустым");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
