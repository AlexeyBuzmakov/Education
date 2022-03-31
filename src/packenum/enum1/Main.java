package packenum.enum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Sky", 800);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите состояние движения самолёта");
        String state = scanner.nextLine();
        airplane.setMotionState(airplane.motionStateDetection(state));
        System.out.println("Состояние движения самолёта: " + airplane.getMotionState());
    }
}
