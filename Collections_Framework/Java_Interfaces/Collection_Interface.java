package Collections_Framework.Java_Interfaces;

import java.util.*;

public class Collection_Interface {
  public static void main(String[] args) {
    Collection<String> items = new ArrayList<>();

    // Adding elements
    items.add("Notebook");
    items.add("Pen");
    items.add("Marker");

    // Display Collection
    System.out.println("Collection : " + items);

    // Check if items exists
    System.out.println("Contains Pen? : " + items.contains("Pen"));

    // Removing an element
    items.remove("Pen");
    System.out.println("After removing 'Pen' : " + items);

    // Check collection size
    System.out.println("Collection size : " + items.size());
  }
}
