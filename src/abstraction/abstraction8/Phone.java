package abstraction.abstraction8;

import java.util.Scanner;

public class Phone implements Producer{
    private boolean condition;

    @Override
    public int produce() {
        Scanner scanner = new Scanner(System.in);
        if(condition) {
            int num = scanner.nextInt();
            return num;
        }
        return (int) (10 + Math.random() * 20);
    }

    @Override
    public void switchedOn() {
        condition = true;
        System.out.println("Телефон включён");
    }

    @Override
    public void switchedOff() {
        condition = false;
        System.out.println("Телефон выключен");
    }
}
