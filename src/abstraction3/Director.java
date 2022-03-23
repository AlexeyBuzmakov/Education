package abstraction3;

class Director extends Employee{

    public Director(String name, int age, double workExperience) {
        super(name, age, workExperience);
    }

    @Override
    public void makeReport() {
        System.out.println("Итоговый отчёт готов");
    }
}
