package multithreading.part2.task8;

public class Printer {
    private volatile boolean checkTurn = false;

    public synchronized void printAlphabet(char[] letters, int index) {
        System.out.print(letters[index] + " ");
        checkTurn = !checkTurn;
    }

    public boolean isCheckTurn() {
        return checkTurn;
    }
}
