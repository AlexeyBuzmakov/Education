package lambda.part1;

import java.util.*;


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

        Set<String> treeSet = new TreeSet<>((String o1, String o2) -> Integer.compare(o1.length(), o2.length()));    //4
        treeSet.add("Moscow");
        treeSet.add("Ufa");
        treeSet.add("Chelyabinsk");
        treeSet.add("Kiev");
        treeSet.add("SanFrancisco");

        int[]arr = {12, 19, 27, 44, 65, 71, 89, 113};

        Employee employee = new Employee("Ivan", "Ivanov", 27, "Doctor");

//        Utils.listFilteringOne(listInteger);
//        Utils.listFilteringTwo(listInteger);
//        Utils.listTransformation(listString);
//        System.out.println(treeSet);
//        Utils.variableTypeConversion(10);
//        Utils.increasePerUnit(10);
//        Utils.conversionToJSONFormat(employee);
//        System.out.println(Utils.regularExpressionSearch("FFFathfere","F+athfere"));
//        Utils.integerDivision(4,5);
//        System.out.println(Utils.binarySearch(arr, 111));
    }
}
