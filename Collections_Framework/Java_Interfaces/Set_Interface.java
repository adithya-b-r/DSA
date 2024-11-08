package Collections_Framework.Java_Interfaces;
import java.util.*;

public class Set_Interface {
  public static void main(String[] args) {
    Set<String> uniqueItems = new HashSet<>();

    // Add elements to the set
    uniqueItems.add("C");
    uniqueItems.add("A");
    uniqueItems.add("B");
    uniqueItems.add("A"); //Duplicate won't be added

    // Display the set
    System.out.println(uniqueItems);

    // Check if an item exits
    System.out.println("Contains 'A' ? "+ uniqueItems.contains("A"));

    // Remove an element 
    uniqueItems.remove("B");
    System.out.println("After removing an element : "+ uniqueItems);

    // Check Set size
    System.out.println("Set size : "+ uniqueItems.size());
  }
}
