package Rearrange_Array_Elements_By_Sign;

class optimal {
  public static void main(String[] args) {
    int arr[] = { 3, 1, -2, -5, 2, -4 };
    int n = arr.length;

    int ans[] = new int[n];

    int pos=0;
    int neg=1;

    for(int i=0; i<n; i++){
     if(arr[i]<0){
      ans[i] = arr[neg];
      neg += 2;
     }else{
      ans[i] = arr[pos];
      pos += 2;
     }
    }

    for(int num: ans)
      System.out.print(num+" ");
  }
}
