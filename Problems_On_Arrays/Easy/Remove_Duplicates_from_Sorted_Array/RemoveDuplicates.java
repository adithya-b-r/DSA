package Remove_Duplicates_from_Sorted_Array;

class RemoveDuplicates {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2, 2, 3, 3, 4, 4, 4 };
    int n = nums.length, i, uniqueIndex=0;

    for(i=1; i<n; i++){
      if(nums[i] != nums[uniqueIndex]){
        nums[++uniqueIndex] = nums[i];
      }
    }

    uniqueIndex++;

    for(i=0; i<uniqueIndex; i++){
      System.out.print(nums[i] + " ");
    }
  }
}
