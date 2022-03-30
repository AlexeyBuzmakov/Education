package abstraction.abstraction7;

public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        televisor.switchedOn();
        televisor.switchedOff();
        vacuumCleaner.switchedOn();
        vacuumCleaner.switchedOff();
    }
}
