package Maximum_Consecutive_Ones;

class optimal {
  public static void main(String[] args) {
    int arr[] = { 1, 0, 1, 1, 0, 1 };
    int count = 0, maxOne = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        count++;
        maxOne = Math.max(count, maxOne);
      } else {
        count = 0;
      }
    }

    System.out.println("Maximum consecutive ones: " + maxOne);
  }
}