package Find_the_Number_that_Appears_Once;

class optimal {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2, 3, 4, 4 };
    int xor = 0;

    for (int i = 0; i < nums.length; i++) {
      xor = xor ^ nums[i];
    }

    System.out.println(xor);
  }
}
