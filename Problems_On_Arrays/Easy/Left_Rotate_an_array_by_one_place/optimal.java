package Left_Rotate_an_array_by_one_place;

class optimal {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int n = arr.length;
    int temp;

    temp = arr[0];
    for (int i = 1; i < n; i++) {
      arr[i-1] = arr[i];
    }
    arr[n - 1] = temp;

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}