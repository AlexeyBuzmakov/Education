package exception.exception4;

public class Timer {
    public void displayAlert(int a, int b) {
        if(a > 24) {
            throw new IllegalArgumentException("В дне только 24 часа");
        }
        else if(b > 24) {
            throw new IllegalArgumentException("В дне только 24 часа");
        }
        int i = 0;
        while(i <= 24) {
           if(i == a) {
               System.out.println(a + ":00 - Начало оповещения");
           }
           else if(i == b) {
               System.out.println(b + ":00 - Конец оповещения");
           }
            i++;
        }
    }
}
