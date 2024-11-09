import java.util.*;

public class TreeSet_Class {
  public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();

    // Adding elements to set
    set.add(20);
    set.add(10);
    set.add(5);
    set.add(30);
    set.add(25);

    // Elements will be in sorted order
    System.out.println("Set contains : " + set);
    System.out.println("Set in descending order : " + set.descendingSet());

    System.out.println("First element : "+set.first());
    System.out.println("Last element : "+set.last());

    System.out.println("Higher than 20 : "+set.higher(20));
    System.out.println("Lower than 20 : "+ set.lower(20));

    //Removing an element
    set.remove(20);

    System.out.println("Subset of 5 [Inclusive] - 30 [Exclusive] : "+ set.subSet(5, 30));

    System.out.println("Set size : "+ set.size());
    System.out.println("Is set empty? : "+set.isEmpty());
    System.out.println("Set contains 10? : "+set.contains(10));
    
    set.clear();
  }
}
