package reflection.part3.task6;
@MyAnnotation(info = "My class")
public class Animal {
    private String name;
    private String classification;
    private int age;

    public Animal(String name, String classification, int age) {
        this.name = name;
        this.classification = classification;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                ", age=" + age +
                '}';
    }
}
