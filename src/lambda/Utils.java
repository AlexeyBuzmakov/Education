package lambda;

import java.util.*;
import java.util.function.UnaryOperator;

public class Utils {                                                                                                 //1
    public static void listFilteringOne(List<Integer>list) {
        list.removeIf(x -> x < 10 || x > 100);
        System.out.println(list);
    }

    public static void listFilteringTwo(List<Integer>list) {                                                         //2
        list.removeIf(x -> {
        String[]numbers = x.toString().split("");
        int sum = 0;
            for (String s : numbers) {
                sum += Integer.parseInt(s);
            }
            return sum > 10;
        });
        System.out.println(list);
    }

    public static void listTransformation(List<String>list) {                                                        //3
        List<Integer>listInteger = new ArrayList<>();
        list.forEach(x -> {
            listInteger.add(Integer.parseInt(x));
        });
        System.out.println(listInteger);
    }

    public static<T> void variableTypeConversion(T name) {                                                           //5
        MyFunction<T, String>function = x -> "String: " + x;
        System.out.println(function.apply(name));
    }

    public static void increasePerUnit(int num) {                                                                    //6
        UnaryOperator<Integer>operator = x -> x + 1;
        System.out.println(operator.apply(num));
    }

    public static<T> void conversionToJSONFormat(Employee employee) {                                                //7
        MyFunction<Employee, String>function = x ->
        "{\n" + "\"" + employee.getClass().toString() + "\":[\n" + "{\n" + "\"" + employee.getName() + "\",\n" +
        "\"" + employee.getSurname() + "\",\n" + "\"" + employee.getAge() + "\",\n" + "\"" + employee.getJob() + "\"\n" +
        "}\n]\n}";
        System.out.println(function.apply(employee));
    }

    @SuppressWarnings("all")
    public static boolean regularExpressionSearch(String str, String sample) {                                       //1
        if(str.length() < sample.length() - 1) {
            return false;
        }
        boolean fullCycle = false;
        boolean repet = false;
        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && !repet) {
                repet = true;
                start = i;
            } else if (str.charAt(i) != str.charAt(i + 1) && repet) {
                end = i;
                break;
            }
            if(repet && i == str.length() - 2) {
                fullCycle = true;
            }
        }

        if (repet && !fullCycle) {
            return (str.substring(0, start) + str.substring(end)).equals(sample.substring(0, sample.indexOf("+")) +
                    sample.substring(sample.indexOf("+") + 1));
        }
        else if(!repet) {
            return str.equals(sample.substring(0, sample.indexOf("+")) + sample.substring(sample.indexOf("+") + 1));
        }
        else if(repet && fullCycle) {
            System.out.println(str.substring(0, start + 1) + " " + sample.substring(0, sample.indexOf("+")) + sample.substring(sample.indexOf("+") + 1));
            return (str.substring(0, start + 1)).equals(sample.substring(0, sample.indexOf("+")) + sample.substring(sample.indexOf("+") + 1));
        }
        return false;
    }

    public static void integerDivision(int a, int b) {                         //2 Не стал учитывать отрицательные числа
        int count = 0;
        while(a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count);
    }

    public static boolean binarySearch(int[]arr, int a) {                                                            //3
        int mid = arr.length / 2;
        if (a == arr[mid]) {
            return true;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (a < arr[mid]) {
                end = mid - 1;
            } else if (a > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
            System.out.println(mid);
        }
        return false;
    }
}

