package Largest_Element_in_an_Array;

class brute {
  public static void main(String[] args) {
    int arr[] = { 5, 2, 8, 11, 4, 2, 1, 4, 9 };
    int temp;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length; j++) {
        if (arr[j] < arr[j - 1]) {
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }

    System.out.println("Largest Element: " + arr[arr.length - 1]);
  }
}
