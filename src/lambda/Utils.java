package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
        list.forEach(x -> {listInteger.add(Integer.parseInt(x));});
        System.out.println(listInteger);
    }

    public static void sortStringLenght(List<String>list) {                                                         //4?
        Comparator<String> comparator = (o1, o2) -> Integer.compare(o1.length(), o2.length());
        System.out.println(list);
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

    public static boolean regularExpressionSearch(String str, String sample) {                                       //1
        if (str.length() < sample.length() - 1) {
            return false;
        }
        int indexRepeat = sample.indexOf("+");
        sample = sample.substring(0, indexRepeat) + sample.substring(indexRepeat + 1);
        String[] newStr = str.split("");
        String[] newSample = sample.split("");
        int countRepet = 0;
        for (int i = 0; i < newStr.length; i++) {
            if (i == indexRepeat) {
                while (newStr[i].equals(newStr[i - 1]) && i < newStr.length - 1) {
                    i++;
                    countRepet++;
                }
            }
            System.out.println(newStr[i] + " " + newSample[i - countRepet]);
            if (!newStr[i].equals(newSample[i - countRepet])) {
                return false;
            }
        }
        return true;
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

