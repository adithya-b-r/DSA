package Longest_subarray_with_given_sum_K_Positive;

class brute {
  static int longestSubarray(int arr[], int K) {
    int n = arr.length;
    int lngSub = 0; 
    int sum;

    for(int i=0; i<n; i++){
      sum = 0;
      for(int j=i; j<n; j++){
        sum += arr[j];

        if(sum == K){
          lngSub = Math.max(lngSub, j-i+1);
        }else if(sum > K){
          break;
        }
      }
    }

    return lngSub;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
    int k = 10;

    System.out.println("Longest Subarray: " + longestSubarray(arr, k));
  }
}
