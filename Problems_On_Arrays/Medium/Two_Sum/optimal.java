import java.util.Arrays;

public class optimal {
  public static void main(String[] args) {
    int arr[] = { 2, 6, 5, 8, 11 };
    int target = 14;

    Arrays.sort(arr);

    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == target) {
        System.out.println(arr[left] + " + " + arr[right] + " = " + target);
        break;
      }
      else if(sum < target){
        left++;
      }else{
        right--;
      }   
    }
  }
}
