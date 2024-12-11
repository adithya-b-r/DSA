package Find_the_Union;

import java.util.TreeSet;

class brute {
  public static void main(String[] args) {
    int arr1[] = { 1, 1, 2, 3, 4, 5, 9 };
    int arr2[] = { 2, 3, 4, 4, 5, 6, 7, 11 };

    TreeSet<Integer> union = new TreeSet<>();

    for (int i = 0; i < arr1.length; i++)
      union.add(arr1[i]);

    for (int i = 0; i < arr2.length; i++)
      union.add(arr2[i]);

    for(int i: union){
      System.out.print(i+" ");
    }
  }
}
