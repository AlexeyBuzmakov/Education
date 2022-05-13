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
        map.put(new Employee("Vladimir", 25), logistics);
        map.put(new Employee("Ivan", 33), finance);
        map.put(new Employee("Oleg", 42), logistics);
        map.put(new Employee("Inna", 21), finance);
        map.put(new Employee("Olga", 37), finance);
        map.put(new Employee("Nikita", 25), supply);
        map.put(new Employee("Nikita", 25), supply);

        Set<Map.Entry<Employee, Department>>entries = map.entrySet();
        for(Map.Entry<Employee, Department>entry : entries) {
            System.out.println("Сотрудник: " + entry.getKey() + " Департамент: " + entry.getValue());
        }

        Utils.depMaxCountEmployee(map);
        Utils.countDepartment(map);
    }
}
