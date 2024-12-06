package Largest_Element_in_an_Array;

class optimal {
  public static void main(String[] args) {
    int arr[] = { 5, 2, 8, 11, 4, 2, 1, 4, 9 };
    int n = arr.length;
    int max = arr[0];

    for (int i = 1; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    System.out.println("Largest Element: " + max);
  }
}
