package collections.map.task.t2_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Department supply = new Department("Supply");
        Department finance = new Department("Finance");
        Department logistics = new Department("Logistics");

        Map<Employee, Department>map = new HashMap<>();
        map.put(new Employee("Vladimir", 11), logistics);
        map.put(new Employee("Ivan", 7), finance);
        map.put(new Employee("Oleg", 2), logistics);
        map.put(new Employee("Inna", 13), finance);
        map.put(new Employee("Olga", 16), finance);
        map.put(new Employee("Nikita", 8), supply);

        Set<Map.Entry<Employee, Department>>entries = map.entrySet();
        for(Map.Entry<Employee, Department>entry : entries) {
            System.out.println("Сотрудник: " + entry.getKey() + " Департамент: " + entry.getValue());
        }

        Utils.getInfo(map);


    }
}
