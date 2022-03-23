package abstraction3;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Jack", 42, 19);
        FinancialDirector financialDirector = new FinancialDirector("Alex", 37, 13);
        HrDirector hrDirector = new HrDirector("Ann", 29, 9);
        director.makeReport();
        financialDirector.makeReport();
        financialDirector.prepareFinancialPlan();
        hrDirector.makeReport();
        hrDirector.hireWorker();
    }
}
