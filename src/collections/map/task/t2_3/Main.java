package collections.map.task.t2_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String>patients = new HashMap<>();
        int i = 1;
        while(i <= 10) {
            patients.put(i, "Patient" + i);
            i++;
        }

        System.out.println(Utils.get(patients));

        Utils.remove(patients);

        Utils.set(patients);

        System.out.println(patients);

    }
}
