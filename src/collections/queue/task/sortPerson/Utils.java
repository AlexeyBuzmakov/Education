package collections.queue.task.sortPerson;

import java.util.Queue;

public class Utils {

    public static <T> void printQueue(Queue<T>queue) {
        while(queue.peek() != null) {
            System.out.print("[" + queue.peek() + "]");
            queue.poll();
        }
        System.out.println();
    }
}
