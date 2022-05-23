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
        if(num < 0) {
            return new StringBuilder("Некорректный ввод");
        }
        createConverter();
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            if (num < 1000 && num > 100) {
                if (numb.higherKey(num) - num <= 100) {
                    str.append(numb.get(100)).append(numb.get(numb.ceilingKey(num)));
                    num -= numb.ceilingKey(num) - 100;
                    continue;
                }
            }
            if (num < 100 && num > 10) {
                if (numb.higherKey(num) - num <= 10) {
                    str.append(numb.get(10)).append(numb.get(numb.ceilingKey(num)));
                    num -= numb.ceilingKey(num) - 10;
                    continue;
                }
            }
            if (num < 10) {
                if (numb.higherKey(num) - num == 1) {
                    str.append(numb.get(1)).append(numb.get(numb.ceilingKey(num)));
                    num -= numb.ceilingKey(num) - 1;
                    continue;
                }
            }
            str.append(numb.get(numb.floorKey(num)));
            num -= numb.floorKey(num);
        }
        return str;
    }
}
