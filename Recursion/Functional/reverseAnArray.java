package Functional;

class reverseAnArray {
  static void revArr(int arr[], int i, int n){
    if(i>=n/2)
      return;

    int temp = arr[i];
    arr[i] = arr[n-1];
    arr[n-1] = temp;

    revArr(arr, i+1, n-1);
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};

    revArr(arr, 0, arr.length);

    for(int i=0; i<arr.length; i++)
      System.out.println(arr[i]);
  }
}