package generics.generics3.task3;

public class Utils {

    public int calculateSum(int... nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }
}
