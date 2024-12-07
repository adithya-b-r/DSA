package Find_missing_number_in_an_array;

class brute {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 5 };
    int n = arr.length, flag;

    for (int i = 1; i < n; i++) {
      flag = 0;
      for (int j = 0; j < n; j++) {
        if (arr[j] == i) {
          flag = i;
          break;
        }
      }
      if (flag != i) {
        System.out.println("Missing Number: " + i);
        break;
      }
    }
  }
}