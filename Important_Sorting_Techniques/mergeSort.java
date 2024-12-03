import java.util.ArrayList;
import java.util.Scanner;

public class mergeSort {
  static void merge(int arr[], int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }

    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }

  static void mergeSorting(int arr[], int low, int high) {
    if (low >= high)
      return;

    int mid = (low + high) / 2;
    mergeSorting(arr, low, mid);
    mergeSorting(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of Array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter element " + i + ": ");
      arr[i] = sc.nextInt();
    }

    mergeSorting(arr, 0, arr.length - 1);

    System.out.println("After sorting: ");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }
}