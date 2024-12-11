package Right_Rotate_an_array_by_K_place;

import java.util.Scanner;

class optimal {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    int n = arr.length;
    int temp, k, i, j;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value for K: ");
    k = sc.nextInt() % n;

    for (i = 0; i < k; i++) {
      temp = arr[n - 1];
      for (j = n-1; j > 0; j--) {
        arr[j] = arr[j-1];
      }

      arr[0] = temp;
    }

    for (i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
