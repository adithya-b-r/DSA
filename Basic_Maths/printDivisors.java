package Basic_Maths;

class printDivisors {
  static void displayDivisors1(int n){
    System.out.println("Divisors of "+n+" are: ");
    for(int i=1; i<=n; i++){
      if(n%i == 0)
        System.out.println(i);
    }
  }

  static void displayDivisors2(int n) {
    System.out.println("Divisors of " + n + " are: ");
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0)
        System.out.println(i);
      
        if(n%(n/i) == 0)
          System.out.println(n/i);
    }
  }

  public static void main(String[] args) {
    int n = 13;
    displayDivisors1(n);  //Method 1
    displayDivisors2(n);  //Method 2
  }
}
