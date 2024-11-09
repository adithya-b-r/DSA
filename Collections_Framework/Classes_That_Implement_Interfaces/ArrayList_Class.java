import java.util.*;

public class ArrayList_Class {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    // Adding elements to ArrayList
    list.add("Apple");
    list.add("Orage");
    list.add(0, "Banana");

    // Displaying all the elements
    System.out.println(list);

    // Reposition the orange
    list.set(0, "Orange");

    // Remove element based on value and index
    list.remove("Apple");
    list.remove(1);

    System.out.println("List items : " + list + "\nList size : " + list.size());

    System.out.println("Contains Apple ? : " + list.contains("Apple"));

    System.out.println("Is list empty? : " + list.isEmpty());

    // Removes all elements
    list.clear();

    // Returns -1 if not found
    System.out.println(list.indexOf("Orange"));
  }
}
