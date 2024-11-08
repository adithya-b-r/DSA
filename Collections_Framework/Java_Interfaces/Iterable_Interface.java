package Collections_Framework.Java_Interfaces;
import java.util.*;

public class Iterable_Interface{
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    // Create an iterator for List
    Iterator<String> iterator = names.iterator();

    // Loop through the list using iterator
    while(iterator.hasNext()){
      String name = iterator.next();
      if(name.equals("Bob"))
        iterator.remove();  //Removing element using iterator.
    }

    System.out.println("Updated List : "+ names);
  }
}