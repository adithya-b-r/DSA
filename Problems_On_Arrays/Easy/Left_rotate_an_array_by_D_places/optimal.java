package Left_rotate_an_array_by_D_places;

class optimal {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int k=3;
    int n = arr.length, temp;

    for(int i=0; i<k; i++){
      temp = arr[0];
      for(int j=1; j<n; j++)
        arr[j-1] = arr[j];

      arr[n-1] = temp;
    }

    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
