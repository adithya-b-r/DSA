package Find_the_Number_that_Appears_Once;

class brute {
  public static void main(String[] args) {
    int nums[] = { 1, 1, 2, 3, 3, 4, 4 };
    int n = nums.length, repeat = 0, once=-1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (nums[i] == nums[j])
          repeat++;
      }

      if (repeat == 1) {
        once = nums[i];
        break;
      }

      repeat = 0;
    }

    System.out.println("Single number: "+once);;
  }
}
