import java.util.*;

public class PriorityQueue_Class {
  public static void main(String[] args) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    // Adding elements to queue
    queue.add(10);
    queue.offer(5);

    System.out.println("Elements in queue : " + queue);

    System.out.println("Retrives head without removing: " + queue.peek());

    System.out.println("Retrives and removes head : " + queue.poll());

    System.out.println("Queue size : " + queue.size());
    System.out.println("Is queue empty? : " + queue.isEmpty());

    System.out.println("Elements in queue : " + queue);

    queue.clear();
  }
}
