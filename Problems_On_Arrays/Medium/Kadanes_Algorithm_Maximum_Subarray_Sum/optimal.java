package Kadanes_Algorithm_Maximum_Subarray_Sum;

class optimal {
  public static void main(String[] args) {
    int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int n = arr.length;
    int sum=0;
    int maxi = Integer.MIN_VALUE;
    int start=0;
    int ansStart=0;
    int ansEnd=0;

    for(int i=0; i<n; i++){
      if(sum == 0){
        start = i;
      }

      sum = sum+arr[i];

      if(sum > maxi){
        maxi = sum;
        ansStart = start;
        ansEnd = i;
      }

      if(sum < 0)
        sum = 0;
    }

    System.out.println("Maximum Subarray Sum: " + maxi);
    System.out.println("Start: " + ansStart);
    System.out.println("End: " + ansEnd);
  }
}
