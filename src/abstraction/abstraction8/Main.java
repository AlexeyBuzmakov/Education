package abstraction.abstraction8;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.switchedOff();
        phone.switchedOn();
        System.out.println(phone.produce());
    }
}
