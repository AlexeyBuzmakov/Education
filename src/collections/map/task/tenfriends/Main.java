package collections.map.task.tenfriends;

public class Main {
    public static void main(String[] args) {
        int[]arr = new int[10];

        Utils.createArray(arr);
        System.out.println(Utils.maxRepetNumber(arr));
    }
}
