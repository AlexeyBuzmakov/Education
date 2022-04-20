package generics.generics3.task4;

public class Main {
    public static void main(String[] args) {
        Utils<Float> utils = new Utils<>();
        double sum = utils.calculateSum(5F, 13F, 22F, 44F, 16F);
        System.out.println(sum);
    }
}
