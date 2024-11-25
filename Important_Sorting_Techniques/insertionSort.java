public class insertionSort {
  public static void main(String args[]) {
    int arr[] = { 7, 5, 2, 8, 1, 3, 4, 6 };
    int n = arr.length;

    for(int i=0; i<n-1; i++){
      int j = i;

      while(j>0 && arr[j-1] > arr[j]){
        int temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;

        j--;
      }
    }

    System.out.print("Sorted Array: ");
    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }

  }
}