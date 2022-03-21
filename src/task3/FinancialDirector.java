package task3;

class FinancialDirector extends Director{

    public FinancialDirector(String name, int age, double workExperience) {
        super(name, age, workExperience);
    }

    public void prepareFinancialPlan() {
        System.out.println("Финансовый план готов");
    }

    public void makeReport() {
        System.out.println("Финансовый отчёт готов");
    }
}
