import java.util.*;

public class HashSet_Class {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();

    System.out.println("Trying to add 'Apple' to set : "+set.add("Apple"));
    set.add("Banana");
    System.out.println("Trying to add 'Apple' for 2nd time to set : "+set.add("Apple"));

    set.remove("Banana");
    System.out.println("Contain Apple? : " + set.contains("Apple"));

    //Displaying contents of Set
    System.out.println(set);

    System.out.println("Set size : "+set.size());

    System.out.println("Is set empty? : "+set.isEmpty());
    set.clear();
  }
}
