package basicMaths;

class armstrongNumber {
  static boolean checkArmstrong(int n){
    int original = n;
    int sum = 0;

    while(n>0){
      int lastDigit = n%10;
      sum += (lastDigit*lastDigit*lastDigit);
      n /= 10;
    }

    return sum == original;
  }
  public static void main(String[] args) {
    int n = 153;

    System.out.println(checkArmstrong(n));
  }
}
