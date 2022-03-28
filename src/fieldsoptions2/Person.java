package fieldsoptions2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String checkAdulthood() {
        if(age >= 18) {
            return "Совершеннолетний";
        }
        else if(age >= 0){
            return "Несовершеннолетний";
        }
        else {
            return "Некоректный ввод";
        }
    }

    public String checkStatus() {
        if(age >=65) {
            return "Пенсионер";
        }
        else if(age >=23) {
            return  "Работающий";
        }
        else if(age >=18) {
            return  "Студент";
        }
        else if(age >= 7) {
            return  "Школьник";
        }
        else if(age >= 3) {
            return "Дошкольник";
        }
        else if(age >= 0) {
            return  "Ребенок";
        }
        else {
            return "Некорректный ввод";
        }
    }

    public void info() {
        System.out.println(name + " " + age + " " + checkAdulthood() + " " + checkStatus());
    }
}
