package Collections_Framework.Java_Interfaces;
import java.util.*;

public class Map_Interface {
  public static void main(String[] args) {
    Map<String, Integer> fruits = new HashMap<>();

    // Add key-value pairs to the Map
    fruits.put("Apple", 10);
    fruits.put("Banana", 5);
    fruits.put("Orange", 8);

    // Retrieve the value using key
    System.out.println("Apple count : "+ fruits.get("Apple"));
    
  }
}
