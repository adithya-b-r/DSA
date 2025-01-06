package Kadanes_Algorithm_Maximum_Subarray_Sum;

class better {
  public static void main(String[] args) {
    int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int n = arr.length;
    int sum = 0;
    int max = 0;

    for (int i = 0; i < n; i++) {
      sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        max = Math.max(sum, max);
      }
    }

    System.out.println("Maximum Subarray Sum: " + max);
  }
}
