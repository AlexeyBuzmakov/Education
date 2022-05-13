package collections.map.task.t2_3;

import java.util.*;

public class Utils {

    public static void remove(Map<Integer, String>map) {
        List<Integer>list = new LinkedList<>();
        Set<Integer>keys = map.keySet();
        for(Integer key : keys) {
            if(key % 2 != 0) {
                list.add(key);
            }
        }
        for(Integer num : list) {
            map.remove(num);
        }
    }

    public static String get(Map<Integer, String>map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID пациента");
        return map.get(scanner.nextInt());
    }

    public static void set(Map<Integer, String>map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID пациента");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите значение для замены");
        String value = scanner.nextLine();
        map.put(id, value);
    }
}
