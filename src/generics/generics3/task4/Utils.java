package generics.generics3.task4;

public class Utils <T extends Number>{

    @SuppressWarnings("all")
    public double calculateSum(T... nums) {
        double sum = 0;
        for(T num : nums) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
