package Sort_an_array_of_0s_1s_and_2s;

class better {
  public static void main(String[] args) {
    int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 1, 2, 0, 0, 0, 1 };
    int n = arr.length;

    int c0 = 0, c1 = 0; //c2 = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] == 0)
        c0++;
      else if (arr[i] == 1)
        c1++;
      else if (arr[i] == 2)
        continue;
        // c2++;
    }

    for (int i = 0; i < c0; i++)
      arr[i] = 0;

    for (int i = c0; i < c0 + c1; i++)
      arr[i] = 1;

    for (int i = c0 + c1; i < n; i++)
      arr[i] = 2;

    for (int i : arr)
      System.out.print(i + " ");
  }
}
