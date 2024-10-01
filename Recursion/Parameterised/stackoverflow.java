package Parameterised;

class stackoverflow {
  static void testingOverflow(int a){
    int n=1;

    testingOverflow(n);
    System.out.println(a);
  }
  public static void main(String[] args) {
    testingOverflow(1);
  }
}
