class brute {
  public static void main(String[] args) {
    int arr[] = { 2, 6, 5, 8, 11 };
    int target = 14;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if ((arr[i] + arr[j]) == target && i != j) {
          System.out.println(arr[i] + " + " + arr[j] + " = " + target);
        }
      }
    }
  }
}