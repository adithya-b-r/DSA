import java.util.Scanner;

class quickSort {
  static void sort(int arr[], int low, int high) {
    if (low < high) {
      int partitionIndex = partition(arr, low, high);

      sort(arr, low, partitionIndex - 1);
      sort(arr, partitionIndex + 1, high);
    }
  }

  static int partition(int arr[], int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
      while (arr[i] <= pivot && i <= high - 1) {
        i++;
      }

      while(arr[j] > pivot && j >= low+1){
        j--;
      }

      if(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
  }

  public static void main(String args[]) {
    int n, i;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size for Array: ");
    n = sc.nextInt();
    int arr[] = new int[n];

    for (i = 0; i < n; i++) {
      System.out.print("Enter element " + (i + 1) + " :");
      arr[i] = sc.nextInt();
    }

    sort(arr, 0, arr.length-1);

    System.out.println("Array After Sorting: ");
    for (i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}