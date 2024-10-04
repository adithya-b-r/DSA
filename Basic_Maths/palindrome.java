package Basic_Maths;

class palindrome {

  static boolean checkPalindrome(int n){
    int original = n;
    int rev = 0;

    while(n>0){
      int lastDigit = n%10;
      rev = rev*10 + lastDigit;
      n /= 10;
    }

    return original == rev;
  }
  public static void main(String[] args) {
    int n = 12321;

    System.out.println(checkPalindrome(n));
  }
}
