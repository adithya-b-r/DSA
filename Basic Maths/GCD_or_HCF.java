package basicMaths;

class GCD_or_HCF {
  static void checkGCD1(int n1, int n2){
    int gcd = 0; 
    for(int i=1; i<=Math.min(n1, n2); i++){
      if(n1%i == 0 && n2%i == 0)
        gcd = i;
    }

    System.out.println("GCD: "+gcd);
  }

  static void checkGCD2(int n1, int n2){
    int gcd = 0; 
    
    while(n1 > 0 && n2 > 0){
      if(n1>n2)
        n1 = n1 % n2;
      else 
        n2 = n2 % n1;
    }

    gcd = n1==0? n2: n1 ;

    System.out.println("GCD: "+gcd);
  }

  public static void main(String[] args) {
    int n1 = 32, n2 = 28;

    checkGCD1(n1, n2);  //Method 1
    checkGCD2(n1, n2);  //Method 2
  }
}