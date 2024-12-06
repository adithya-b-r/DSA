package Second_Largest_Element_in_an_Array;

class better {
  public static void main(String[] args) {
    int arr[] = { 7, 4, 2, 7, 1, 5 };
    int n = arr.length;
    int i, largest = arr[0], secondLargest = -1;

    for (i = 0; i < n; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }

    for (i = 1; i < n; i++) {
      if (arr[i] > arr[i - 1]) {
        if (arr[i] != largest)
          secondLargest = arr[i];
      }
    }

    System.out.println("Second Largest: "+secondLargest);
  }
}
