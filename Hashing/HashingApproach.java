// package Hashing;
import java.util.Scanner;

class HashingApproach{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of array : ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter elements of array : ");
    for(int i=0; i<n; i++)
      arr[i] = sc.nextInt();

    int hash[] = new int[12]; //Only applicable for max num 12.
    for(int i=0; i<n; i++)
      hash[arr[i]] += 1;

    System.out.println("Enter value for q : ");
    int q = sc.nextInt();

    while(q-- > 0){
      int number;
      System.out.println("Enter value for number : ");
      number = sc.nextInt();
      System.out.println(hash[number]);
    }

    sc.close();
  }
}