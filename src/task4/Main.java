package task4;

public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(250, 18, 17, 60);
        BMW bmw = new BMW(270, 26,20,60);
        Lada lada = new Lada(180,14,17,60);
        Kia kia = new Kia(220,12,17,60);
        System.out.println("Mercedes проехал трассу за " + mercedes.startRace() + " ходов.");
        System.out.println("BMW проехала трассу за " + bmw.startRace() + " ходов.");
        System.out.println("LADA проехала трассу за " + lada.startRace() + " ходов.");
        System.out.println("KIA проехала трассу за " + kia.startRace() + " ходов.");
    }
}
