package lambda;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer>listInteger = new ArrayList<>();
        listInteger.add(5);
        listInteger.add(37);
        listInteger.add(16);
        listInteger.add(144);
        listInteger.add(8);
        listInteger.add(59);
        listInteger.add(23);
        listInteger.add(151);
        listInteger.add(89);

        List<String>listString = new ArrayList<>();
        listString.add("10");
        listString.add("20");
        listString.add("30");
        listString.add("40");
        listString.add("50");

        List<String>listWords = new ArrayList<>();
        listWords.add("Moscow");
        listWords.add("Ufa");
        listWords.add("Chelyabinsk");
        listWords.add("Kiev");
        listWords.add("SanFrancisco");

        int[]arr = {12, 19, 27, 44, 65, 71, 89, 113};

        Employee employee = new Employee("Ivan", "Ivanov", 27, "Doctor");
//        Utils.listFilteringOne(listInteger);
//        Utils.listFilteringTwo(listInteger);
//        Utils.listTransformation(listString);
//        Utils.sortStringLenght(listWords);
//        Utils.variableTypeConversion(a);
//        Utils.increasePerUnit(a);
//        Utils.conversionToJSONFormat(employee);
        System.out.println(Utils.regularExpressionSearch("Fatttttthereeeee","Fat+here"));
//        Utils.integerDivision(4,5);
//        System.out.println(Utils.binarySearch(arr, 111));
    }
}
