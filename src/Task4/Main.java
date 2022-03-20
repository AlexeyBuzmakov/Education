package Task4;

public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(250, 18, 17, 60);
        BMW bmw = new BMW(270, 26,20,60);
        Lada lada = new Lada(180,14,17,60);
        Kia kia = new Kia(220,12,17,60);
        mercedes.numberMovesFinish();
        bmw.numberMovesFinish();
        lada.numberMovesFinish();
        kia.numberMovesFinish();
    }
}
