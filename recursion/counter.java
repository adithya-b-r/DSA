package recursion;

class counter {
  static void countTill(int n) {
    if (n == 0)
      return;

    // System.out.println(n);  //Decending order
    countTill(n - 1);
    System.out.println(n);  //Ascending order
  }

  public static void main(String[] args) {
    int count = 40;
    countTill(count);
  }
}
