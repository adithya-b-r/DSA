package Basic_Maths;

class digitExtraction {
  public static void main(String[] args) {
    int n = 7789;

    while(n>0){
      int lastDigit = n%10;
      System.out.println(lastDigit);
      n /= 10;
    }
  }  
}