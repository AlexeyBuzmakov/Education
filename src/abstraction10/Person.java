package abstraction10;

public class Person implements Service{
    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void createObject() {
        Person person = new Person(getName(), getAge());
    }

    @Override
    public String makeString() {
        return "Имя " + name + " возраст " + age;

    }

    @Override
    public void clear() {
        name = null;
        age = null;
    }
}
