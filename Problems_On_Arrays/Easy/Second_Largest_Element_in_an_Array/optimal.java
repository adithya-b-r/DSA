package Second_Largest_Element_in_an_Array;

class optimal {
  public static void main(String[] args) {
    int arr[] = { 7, 4, 2, 7, 1, 5, 6, 7, 9 };
    int n = arr.length;
    int largest = arr[0], secondLargest = -1;

    for (int i = 1; i < n; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] < largest && arr[i] > secondLargest) {
        secondLargest = arr[i];
      }

    }

    System.out.println("Largest Element: " + largest);
    System.out.println("Second Largest Element: " + secondLargest);
  }
}
