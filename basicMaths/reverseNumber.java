package basicMaths;

public class reverseNumber {
  static int reverseThisNumber(int n) {
    int rev = 0;
    while (n > 0) {
      int lastDigit = n % 10;
      rev = rev * 10 + lastDigit;
      n /= 10;
    }

    return rev;
  }

  public static void main(String[] args) {
    int n = 13283;
    System.out.println(reverseThisNumber(n));
  }
}
