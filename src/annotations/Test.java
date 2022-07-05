package annotations;
@MyAnnotationTwo(author = "Alexey", year  = 2022, description = "test")
public class Test {
    @MyAnnotationOne(author = "Alexey", year  = 2022, description = "test")
    private String name;
    private int age;

    @MyAnnotationThree(author = "Alexey", year  = {2021, 2022}, description = "test")
    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotationFour(year = 2021, month = "June", day = 5)
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
}
