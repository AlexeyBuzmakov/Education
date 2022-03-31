package packenum.enum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Anna", 23);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш пол");
        String gender = scanner.nextLine();
        person.setGender(person.determineGenderPerson(gender));
        System.out.println(person.getGender());
    }
}
