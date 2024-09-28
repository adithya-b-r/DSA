package basicMaths;

class primeNumber {
  static boolean checkPrime(int n){
    int count = 0;

    for(int i=1; i<=n; i++){
      if(n%i == 0)
        count++;
    }

    return count == 2 ? true : false;
  }
  public static void main(String[] args) {
    int n = 23;

    System.out.println(checkPrime(n));
  }
}
