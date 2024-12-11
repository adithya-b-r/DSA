package Intersection_of_two_Sorted_Array;

class brute {
  public static void main(String[] args) {
    int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
    int arr2[] = { 2, 3, 3, 5, 6, 6, 7 };
    int n1 = arr1.length, n2 = arr2.length;

    int visit[] = new int[n2];

    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < n2; j++) {
        if(arr1[i] == arr2[j] && visit[j] != 1){
          visit[j] = 1;
          break;
        }
      }
    }

    for(int i=0; i<n2; i++){
      if(visit[i] != 0){
        System.out.print(arr2[i] + " ");
      }
    }
  }
}