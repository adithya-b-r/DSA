package Intersection_of_two_Sorted_Array;

import java.util.ArrayList;

class optimal {
  public static void main(String[] args) {
    int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
    int arr2[] = { 2, 3, 3, 5, 6, 6, 7 };
    int n1 = arr1.length, n2 = arr2.length;
    int i = 0, j = 0;

    ArrayList<Integer> intersection = new ArrayList<>();

    while (i < n1 && j < n2) {
      if (arr1[i] < arr2[j])
        i++;
      else if (arr1[i] > arr2[j])
        j++;
      else{
        intersection.add(arr1[i]);
        i++;
        j++;
      }
    }

    for(int num: intersection)
      System.out.print(num+" ");
  }
}
