package Kadanes_Algorithm_Maximum_Subarray_Sum;

class brute {
  public static void main(String[] args) {
    int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int n = arr.length;
    int sum = 0;
    int max = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        sum = 0;

        for (int k = i; k < j; k++)
          sum += arr[k];

        max = Math.max(max, sum);
      }

    }

    System.out.println("Maximum Subarray Sum: " + max);
  }
}
