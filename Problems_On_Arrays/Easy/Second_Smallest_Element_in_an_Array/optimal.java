package Second_Smallest_Element_in_an_Array;

class optimal {
  public static void main(String[] args) {
    int arr[] = { 7, 4, 2, 7, 1, 5, 6, 7, 9, 1 };
    int n = arr.length;
    int smallest = arr[0], secondSmallest = -1;

    for (int i = 1; i < n; i++) {
      if (arr[i] < smallest) {
        secondSmallest = smallest;
        smallest = arr[i];
      } else if (arr[i] > smallest && arr[i] < secondSmallest) {
        secondSmallest = arr[i];
      }

    }

    System.out.println("Smallest Element: " + smallest);
    System.out.println("Second Smallest Element: " + secondSmallest);
  }
}
