package Collections_Framework.Java_Interfaces;

import java.util.*;

public class Map_Interface {
  public static void main(String[] args) {
    Map<String, Integer> fruits = new HashMap<>();

    // Add key-value pairs to the Map
    fruits.put("Apple", 10);
    fruits.put("Banana", 5);
    fruits.put("Orange", 8);

    // Display Map
    System.out.println("Fruits : " + fruits);

    // Retrieve the value using key
    System.out.println("Apple count : " + fruits.get("Apple"));

    // Check if Map contains certain value
    System.out.println("Contains count 8 : " + fruits.containsValue(8));

    // Check if Map contains certain key
    System.out.println("Contains orange : " + fruits.containsKey("Orange"));

    // Remove a key-value pair
    fruits.remove("Orange");
    System.out.println(fruits);

    // Get the size of the Map
    System.out.println("Map size : " + fruits.size());

    // Get all keys
    System.out.println("Keys : "+ fruits.keySet());

    // Get all values
    System.out.println("Values : "+ fruits.values());
  }
}
