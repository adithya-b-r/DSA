package Find_missing_number_in_an_array;

class optimal {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 6, 3, 4 };
    int n = 6;
    int sum = n*(n+1)/2;
    int arrSum=0;

    for(int i=0; i<arr.length; i++){
      arrSum += arr[i];
    }

    System.out.println("Missing number: "+ (sum-arrSum));
  }
}
