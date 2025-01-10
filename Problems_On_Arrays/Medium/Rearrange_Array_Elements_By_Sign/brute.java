package Rearrange_Array_Elements_By_Sign;

class brute {
  public static void main(String[] args) {
    int arr[] = { 3, 1, -2, -5, 2, -4 };
    int n = arr.length;

    int pos[] = new int[n / 2];
    int neg[] = new int[n / 2];

    int p1 = 0, p2 = 0;

    for (int num : arr) {
      if (num > 0)
        pos[p1++] = num;
      else
        neg[p2++] = num;
    }

    p1 = 0;
    p2 = 0;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0)
        arr[i] = pos[p2++];
      else
        arr[i] = neg[p1++];
    }

    for (int num : arr)
      System.out.print(num + " ");
  }
}
