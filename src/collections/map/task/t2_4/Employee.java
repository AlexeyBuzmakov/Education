package collections.map.task.t2_4;

import java.util.Objects;

public class Employee {
    private final String name;
    private final int workExpirience;

    public Employee(String name, int workExpirience) {
        this.name = name;
        this.workExpirience = workExpirience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return workExpirience == employee.workExpirience && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, workExpirience);
    }

    @Override
    public String toString() {
        return name + " " + workExpirience;
    }
}
