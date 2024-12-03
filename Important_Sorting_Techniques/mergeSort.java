import java.util.Scanner;
import java.util.ArrayList;

class mergeSort {
  static void merge(int arr[], int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();

    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left++]);
      } else {
        temp.add(arr[right++]);
      }
    }

    while (left <= mid) {
      temp.add(arr[left++]);
    }

    while (right <= high) {
      temp.add(arr[right++]);
    }

    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }

  static void mergeSorting(int arr[], int low, int high){
    if(low >= high)
      return;

    int mid = (low+high)/2;
    mergeSorting(arr, low, mid);
    mergeSorting(arr, mid+1, high);

    merge(arr, low, mid, high);
  }

  public static void main(String args[]) {
    int i, n;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of Array: ");
    n = sc.nextInt();

    int arr[] = new int[n];

    for (i = 0; i < n; i++) {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
    }

    mergeSorting(arr, 0, n-1);

    System.out.println("Array after sorting: ");
    for (i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}