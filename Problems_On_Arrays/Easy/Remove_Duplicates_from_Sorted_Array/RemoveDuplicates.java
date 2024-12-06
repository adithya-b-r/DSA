package Remove_Duplicates_from_Sorted_Array;

class RemoveDuplicates {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 2, 2, 3, 3, 4, 4, 4 };
    int n = arr.length, i = 0;

    for (int j = 1; j < n; j++) {
      if (arr[i] == arr[j]) {
        arr[i] = 0;
      }
      i++;
    }

    for (int k = 0; k < n; k++) {
      if (arr[k] != 0)
        System.out.print(arr[k] + " ");
    }
  }
}
