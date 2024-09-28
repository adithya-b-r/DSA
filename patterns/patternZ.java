package Patterns;
class patternZ {

  static void pattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 1 || i == n || j == n-i)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(4);
  }
}