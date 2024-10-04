package Basic_Maths;

class armstrongNumber {
  static boolean checkArmstrong(int num){
    int original = num;
    int sum = 0;

    while(num>0){
      int lastDigit = num%10;
      sum += (lastDigit*lastDigit*lastDigit);
      num /= 10;
    }

    return sum == original;
  }
  public static void main(String[] args) {
    int n = 153;

    System.out.println(checkArmstrong(n));
  }
}
