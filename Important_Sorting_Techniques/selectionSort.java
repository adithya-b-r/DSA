class selectionSort {
  public static void main(String[] args) {
    int arr[] = { 6, 3, 8, 2, 9, 1, 7 };
    int i, j, minIndex, temp;

    System.out.print("Array before sorting: ");
    for (i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    for (i = 0; i < arr.length - 1; i++) {
      minIndex = i;
      for (j = i + 1; j < arr.length; j++) {
        if(arr[j] < arr[minIndex]){
          minIndex = j;
        }
      }

      temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }

    System.out.println();
    System.out.print("Array after sorting: ");
    for (i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}