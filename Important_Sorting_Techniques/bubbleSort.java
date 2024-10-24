public class bubbleSort {
  public static void main(String[] args) {
    int arr[] = { 7, 5, 2, 8, 1, 3, 4, 6 };
    int i, j, temp, count=0;
    boolean isSwaped;

    System.out.print("Array before sorting: ");
    for (i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");

    for (i = 0; i < arr.length; i++) {
      isSwaped = false;
      for (j = 0; j < arr.length-i-1; j++) {
        if(arr[j] > arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          isSwaped = true;

          count++;
        }
      }
      if(!isSwaped) 
        break;
    }

    System.out.println();
    System.out.print("Array after sorting: ");
    for (i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");

    System.out.println("\nTotal Steps : "+count);
  }
}
