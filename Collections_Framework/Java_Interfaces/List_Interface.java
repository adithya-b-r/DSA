package Collections_Framework.Java_Interfaces;
import java.util.*;

public class List_Interface {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();

    // Add elements to the list
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Apple");

    // Display the list
    System.out.println("List of fruits : "+ fruits);

    // Access by index
    System.out.println(fruits.get(0));

    // Modify an element
    fruits.set(0, "Orange");
    System.out.println("After modification : "+ fruits);

    // Remove an element
    fruits.remove("Mango");
    fruits.remove(0);

    System.out.println("After removing elements : "+ fruits);

    // Get size of the list
    System.out.println("List size : "+ fruits.size());

    // Iterate using for loop
    for(String fruit: fruits){
      System.out.println(fruit);
    }
  }
}
