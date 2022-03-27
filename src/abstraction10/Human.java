package abstraction10;

public class Human implements Service{
    private String name = "Bob";
    private Integer age = 19;


    @Override
    public Human create() {
        return new Human();
    }

    @Override
    public String makeString() {
        return "Name: " + name + " age: " + age;
    }

    @Override
    public void clear() {
        name = null;
        age = null;
    }

}
