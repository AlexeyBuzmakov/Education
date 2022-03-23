package abstraction7;

public class VacuumCleaner implements Conditioner{

    @Override
    public void switchedOn() {
        System.out.println("Пылесос включён");
    }

    @Override
    public void switchedOff() {
        System.out.println("Пылесос выключен");
    }
}
