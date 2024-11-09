import java.util.*;

public class LinkedList_Class {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();

    list.add("Mango"); // Adds to end
    list.addFirst("Banana"); // Adds at beginning
    list.addLast("Orange"); // Adds at end

    System.out.println("Return index[0] : " + list.get(0)); // Return element at end
    System.out.println("Return first element : " + list.getFirst()); // Returns first element
    System.out.println("Return last element : " + list.getLast()); // Returns last element

    System.out.println("Before emoving : " + list);
    list.removeFirst(); // Removes first element
    System.out.println("After removing first element: " + list);
    list.removeLast(); // Removes last element
    System.out.println("After removing last element: " + list);

    System.out.println("Retrives and remove head : " + list.poll());

    // Adds at end
    list.offer("Grapes");

    System.out.println("List size : " + list.size());
    System.out.println("Contains Apple? : " + list.contains("Apple"));
    System.out.println("Is list empty? : " + list.isEmpty());

    //Removes all the element
    list.clear();
  }
}
