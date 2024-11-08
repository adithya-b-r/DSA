package Collections_Framework.Java_Interfaces;

import java.util.*;

public class Queue_Interface {
  public static void main(String[] args) {
    // Creating a Queue of LinkedList
    Queue<String> tasks = new LinkedList<>();

    tasks.offer("Review Notes");
    tasks.offer("Practice DSA");
    tasks.add("Practice Coding");

    System.out.println("Queue : " + tasks);

    // Peek at the head of the Queue
    System.out.println("Next task : " + tasks.peek());

    //Process the task in FIFO order
    System.out.println("Processing task : " + tasks.poll());
    System.out.println("After processing one task : " + tasks);

    // Get the next task again
    System.out.println("Next task : "+ tasks.peek());
  }
}
