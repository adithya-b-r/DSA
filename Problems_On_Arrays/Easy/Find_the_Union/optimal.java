package Find_the_Union;

import java.util.ArrayList;

class optimal {
  public static void main(String[] args) {
    int arr1[] = { 1, 1, 2, 3, 4, 5, 9 };
    int arr2[] = { 2, 3, 4, 4, 5, 6, 7, 11 };
    int n1 = arr1.length, n2 = arr2.length;
    int i = 0, j = 0;

    ArrayList<Integer> union = new ArrayList<>();

    while (i < n1 && j < n2) {
      if (arr1[i] <= arr2[j]) {
        if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
          union.add(arr1[i]);

        i++;
      } else {
        if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
          union.add(arr2[j]);

        j++;
      }
    }

    while (i < n1) {
      if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
        union.add(arr1[i]);

      i++;
    }

    while (j < n2) {
      if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
        union.add(arr2[j]);

      j++;
    }

    for (int num : union) {
      System.out.print(num + " ");
    }
  }
}
