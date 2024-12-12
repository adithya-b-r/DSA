package Remove_Element;

class optimal {
  static int removeElement(int[] nums, int val) {
    int i, k = 0, n = nums.length;

    for (i = 0; i < n; i++) {
      if (nums[i] != val) {
        nums[k++] = nums[i];
      }
    }

    return k;
  }

  public static void main(String[] args) {
    int nums[] = {0,1,2,2,3,0,4,2};

    int unique = removeElement(nums, 2);

    for(int i=0; i<unique; i++){
      System.out.print(nums[i]+" ");
    }
  }
}
