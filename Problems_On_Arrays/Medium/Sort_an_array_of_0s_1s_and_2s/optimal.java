package Sort_an_array_of_0s_1s_and_2s;

// Dutch National Flag Algorithm.

class optimal {
  static void swap(int arr[], int m, int n) {
    int temp = arr[m];
    arr[m] = arr[n];
    arr[n] = temp;
  }

  static void sortArray(int arr[], int n) {
    int low = 0, mid = 0, high = n - 1;

    while (mid <= high) {
      if (arr[mid] == 0) {
        swap(arr, low, mid);
        low++;
        mid++;
      }
      else if(arr[mid] == 1){
        mid++;
      }
      else{
        swap(arr, mid, high);
        high--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 0, 0, 1 };
    int n = arr.length;

    sortArray(arr, n);

    for (int i : arr)
      System.out.print(i + " ");
  }
}
