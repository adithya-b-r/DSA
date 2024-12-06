package Second_Largest_Element_in_an_Array;

class brute {
  public static void main(String[] args) {
    int arr[] = { 7, 4, 2, 7, 1, 5 };
    int n = arr.length;
    int temp, secondLargest = -1;

    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n; j++) {
        if (arr[j] < arr[j - 1]) {
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }

    for (int i = n - 2; i >= 0; i--) {
      if (arr[n - 1] != arr[i]) {
        secondLargest = arr[i];
        break;
      }
    }

    System.out.println("Second Largest: " + secondLargest);
  }
}
