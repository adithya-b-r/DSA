package Move_Zeros_to_End;

class optimal {
  static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1, 0 };
    int i, j = 0;

    for (i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        swap(arr, i, j);
        j++;
      }
    }

    for (i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}