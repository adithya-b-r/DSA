package Move_Zeros_to_End;

class brute {
  public static void main(String[] args) {
    int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
    int temp[] = new int[arr.length];
    int i, j = 0;

    for (i = 0; i < arr.length; i++) {
      if (arr[i] != 0)
        temp[j++] = arr[i];
    }

    while (j < arr.length) {
      temp[j++] = 0;
    }

    for (i = 0; i < arr.length; i++) {
      arr[i] = temp[i];
    }

    for (i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}