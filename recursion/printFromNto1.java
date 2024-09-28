package recursion;

class printFromNto1 {
  static void printTillN(int n){
    if(n==0)
      return;

    System.out.println(n);
    printTillN(n-1);
  }
  public static void main(String[] args) {
    int n = 20;

    printTillN(n);
  }
}
