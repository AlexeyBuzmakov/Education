package collections.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer>priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        priorityQueue.offer(30);
        priorityQueue.offer(40);
        priorityQueue.offer(50);
        priorityQueue.offer(60);
        priorityQueue.offer(70);
        priorityQueue.offer(80);
        priorityQueue.offer(90);
        priorityQueue.offer(100);

        System.out.println(priorityQueue);
    }
}
