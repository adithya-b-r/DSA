import java.util.*;

public class HashMap_Class {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    // Adding key-value pairs
    map.put("Apple", 10);
    map.put("Banana", 5);
    map.put("Cherry", 8);

    // Display all pairs
    System.out.println(map);

    // Accessing value of Apple
    System.out.println("value of Apple : " + map.get("Apple"));

    // Remove entry using key
    map.remove("Banana");

    System.out.println("Map contains Apple? : " + map.containsKey("Apple"));
    System.out.println("Map contains Value 8? " + map.containsValue(8));

    System.out.println("Map size : " + map.size());

    System.out.println("Is map empty? : "+ map.isEmpty());
    
    System.out.println("All keys : "+map.keySet());
    System.out.println("All values : "+map.values());
    System.out.println("Key-value pairs : "+ map.entrySet());

    // Clear map
    map.clear();
  }
}