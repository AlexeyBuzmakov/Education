package multithreading.part3.task4;

import java.util.List;
import java.util.Random;

public class UtilList {
    private int countAdd = 0;
    private int countRemove = 0;

    public int getCountAdd() {
        return countAdd;
    }

    public int getCountRemove() {
        return countRemove;
    }

    public synchronized void correctionList(List<Integer>list) {
        Random random = new Random();
        int numberCycles = 500;
        while(numberCycles >= 0) {
            switch(random.nextInt(2)) {
                case 0 -> {
                    if(list.size() != 0) {
                        list.remove(list.size() - 1);
                        countRemove++;
                    }
                }
                case 1 -> {
                    list.add(new Random().nextInt(1000));
                    countAdd++;
                }
            }
            numberCycles--;
        }
    }
}
