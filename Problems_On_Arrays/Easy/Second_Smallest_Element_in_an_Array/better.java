package Second_Smallest_Element_in_an_Array;

class better {
  public static void main(String[] args) {
    int arr[] = { 7, 4, 2, 7, 1, 5, 1 };
    int n = arr.length;
    int i, smallest = arr[0], secondSmallest = -1;

    for (i = 0; i < n; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }

    for (i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1]) {
        if (arr[i] != smallest)
          secondSmallest = arr[i];
      }
    }

    System.out.println("Second Smallest: "+secondSmallest);
  }
}
