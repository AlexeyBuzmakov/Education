package abstraction.abstraction3;

public abstract class Employee {
    private String name;
    private int age;
    private double workExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        if(workExperience > 0) {
            this.workExperience = workExperience;
        }
    }

    public Employee(String name, int age, double workExperience) {
        this.name = name;
        this.age = age;
        this.workExperience = workExperience;
    }

    public abstract void makeReport();
}
