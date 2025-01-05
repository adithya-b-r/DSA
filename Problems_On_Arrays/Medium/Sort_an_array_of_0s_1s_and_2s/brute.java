package Sort_an_array_of_0s_1s_and_2s;

class brute {
  public static void main(String[] args) {
    int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 0, 0, 1 };
    int n = arr.length;

    for(int i=0; i<n; i++){
      for(int j=0; j<n-1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    for(int i: arr)
      System.out.print(i+" ");
  }
}
