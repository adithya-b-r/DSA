import java.util.*;

class better {
  public static void main(String[] args) {
    int arr[] = { 2, 2, 3, 3, 1, 2, 2 };
    int n = arr.length;

    int majority = -1;

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }

    for (Map.Entry<Integer, Integer> it : map.entrySet()) {
      if (it.getValue() > (n / 2))
        majority = it.getKey();
    }

    System.out.println("Majority Element: " + majority);
  }
}