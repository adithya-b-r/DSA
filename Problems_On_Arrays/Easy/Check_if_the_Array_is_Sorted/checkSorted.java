package Check_if_the_Array_is_Sorted;

class checkSorted {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 3, 3, 4, 7, 5, 6 }; //Remove 7 to make "Array in sorted order".
    boolean isSorted = true;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i-1] > arr[i]) {
        isSorted = false;
        break;
      }
    }

    if (isSorted)
      System.out.println("Array is in Sorted order.");
    else
      System.out.println("Array is not in Sorted order.");

  }
}