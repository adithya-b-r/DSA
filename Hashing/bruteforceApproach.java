import java.util.Scanner;

public class bruteforceApproach {
  static int findNuminArray(int num, int arr[]){
    int count = 0;

    for(int i=0; i<arr.length; i++)
      if(arr[i] == num)
        count++;

    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array : ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.print("Enter elements of array : ");
    for(int i=0; i<n; i++)
      arr[i] = sc.nextInt();

    System.out.print("Enter number to search for : ");
    int findNum = sc.nextInt();

    System.out.println("Number "+findNum+" found "+findNuminArray(findNum, arr)+" times.");

    sc.close();
  }
}
