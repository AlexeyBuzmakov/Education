package reflection.part3.task6;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader.read("Test.txt", Person.class)
                .forEach(System.out::println);
    }
}
