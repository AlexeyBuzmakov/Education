package collections.map;


public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String>map = new HashMap<>();
        map.put(72, "Tyumen");
        map.put(123, "Sochi");
        map.put(77, "Moscow");
        map.put(77, "Piter");

        map.remove(123);
        System.out.println(map.get(72));
        System.out.println(map.containsKey(77));
        map.printTable();
    }
}
