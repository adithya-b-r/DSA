import java.util.*;

class better {
  public static void main(String[] args) {
    int arr[] = { 2, 6, 5, 8, 11 };
    int target = 14;

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int a = arr[i];
      int remain = target - a;
      if (map.containsKey(remain)) {
        System.out.println("Yes");
        System.out.println(a + " + " + remain + " = " + target);
      }
      map.put(a, i);
    }
  }
}
