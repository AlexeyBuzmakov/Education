package collections.tree.t7;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Converter {
    NavigableMap<Integer, String>numb = new TreeMap<>();

    private void createConverter() {
        numb.put(1, "I");
        numb.put(4, "IV");
        numb.put(5, "V");
        numb.put(9, "IX");
        numb.put(10, "X");
        numb.put(40, "XL");
        numb.put(50, "L");
        numb.put(90, "XC");
        numb.put(100, "C");
        numb.put(400, "CD");
        numb.put(500, "D");
        numb.put(900, "CM");
        numb.put(1000, "M");
    }

    public StringBuilder convert(int num) {
        if (num <= 0) {
            return new StringBuilder("Для конвертации подходят только положительные числа");
        }
        createConverter();
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            str.append(numb.get(numb.floorKey(num)));
            num -= numb.floorKey(num);
        }
        return str;
    }
}
