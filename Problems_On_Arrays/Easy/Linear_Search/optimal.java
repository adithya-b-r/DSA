package Linear_Search;
import java.util.Scanner;

class optimal {
  public static void main(String[] args) {
    int[] arr = { 1, 9, 3, 5, 1, 7, 2, 8, 0, 2, 4, 5 };
    int i, k = -1;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the element to be searched: ");
    int s = sc.nextInt();
    sc.close();

    for (i = 0; i < arr.length; i++)
      if (arr[i] == s) {
        k = i;
        break;
      }

    System.out.println("Position: " + k);
  }
}