package collections.tree.t7;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Converter {
    NavigableMap<Integer, String>numb = new TreeMap<>();

    private void createConverter() {
        numb.put(1, "I");
        numb.put(5, "V");
        numb.put(10, "X");
        numb.put(50, "L");
        numb.put(100, "C");
        numb.put(500, "D");
        numb.put(1000, "M");
    }

    public StringBuilder convert(int num) {
        if (num <= 0) {
            return new StringBuilder("Для конвертации подходят только положительные числа");
        }
        createConverter();
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            if (num < 1000 && num > 100 && numb.higherKey(num) - num <= 100) {
                str.append(numb.get(100)).append(numb.get(numb.ceilingKey(num)));
                num -= numb.ceilingKey(num) - 100;
            } else if (num < 100 && num > 10 && numb.higherKey(num) - num <= 10) {
                str.append(numb.get(10)).append(numb.get(numb.ceilingKey(num)));
                num -= numb.ceilingKey(num) - 10;
            } else if (num < 10 && numb.higherKey(num) - num == 1) {
                str.append(numb.get(1)).append(numb.get(numb.ceilingKey(num)));
                num -= numb.ceilingKey(num) - 1;
            } else {
                str.append(numb.get(numb.floorKey(num)));
                num -= numb.floorKey(num);
            }
        }
        return str;
    }
}
