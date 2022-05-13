package collections.map.task.t1_3;

import java.util.Scanner;

public class Menu {
    Site site = new Site();

    public void start() {
        site.openMenu();
        useMenu();
    }

    private void showMenu() {
        System.out.println(
        "1. Общее количество пользователей \n" +
        "2. Список всех пользователей \n" +
        "3. Список всех логинов \n" +
        "4. Выход");
    }

    private void useMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            if(!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод");
                useMenu();
            }
            switch (scanner.nextInt()) {
                case 1 -> site.showCountUsers();
                case 2 -> site.showRepository();
                case 3 -> site.showListLogins();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Некоректный ввод");
            }
        }
    }
}
