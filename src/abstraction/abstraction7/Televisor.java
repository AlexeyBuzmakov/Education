package abstraction.abstraction7;

public class Televisor implements Conditioner{

    @Override
    public void switchedOn() {
        System.out.println("Телевизор включён");
    }

    @Override
    public void switchedOff() {
        System.out.println("Телевизор выключен");
    }
}
