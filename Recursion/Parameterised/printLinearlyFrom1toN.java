package Parameterised;

class printLinearlyFrom1toN {
  static void printFrom1toN(int i, int n) {
    if (i > n)
      return;

    System.out.println(i);
    printFrom1toN(i+1, n);
  }

  public static void main(String[] args) {
    int n = 10;
    printFrom1toN(1, n);
  }
}
