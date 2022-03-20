package Task3;

class HrDirector extends Employee{

    public HrDirector(String name, int age, double workExperience) {
        super(name, age, workExperience);
    }

    public void hireWorker() {
        System.out.println("Нанять работника");
    }

    @Override
    public void makeReport() {
        System.out.println("Отчёт по кадрам готов");
    }
}
