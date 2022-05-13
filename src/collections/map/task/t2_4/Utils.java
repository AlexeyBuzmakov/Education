package collections.map.task.t2_4;

import java.util.*;

public class Utils {

    public static void depMaxCountEmployee(Map<Employee, Department>map) {
        Map<String, Integer>dep = new HashMap<>();
        Collection<Department>departments = map.values();
        for(Department department : departments) {
            if(dep.containsKey(department.getName())) {
                dep.put(department.getName(), dep.get(department.getName()) + 1);
                continue;
            }
            dep.put(department.getName(), 0);
        }

        Set<Map.Entry<String, Integer>>entries = dep.entrySet();
        String department = null;
        int count = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : entries) {
           if(entry.getValue() > count) {
               count = entry.getValue();
               department = entry.getKey();
           }
        }
        System.out.println("Департамент: " + department + " Работников: " + (count + 1));
    }

    public static void countDepartment(Map<Employee, Department>map) {
        Map<String, Integer>dep = new HashMap<>();
        Collection<Department>departments = map.values();
        for(Department department : departments) {
            if(dep.containsKey(department.getName())) {
                dep.put(department.getName(), dep.get(department.getName()) + 1);
                continue;
            }
            dep.put(department.getName(), 0);
        }
        System.out.println("Департаментов: " + dep.size());
    }
}
