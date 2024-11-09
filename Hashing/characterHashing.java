import java.util.Scanner;

class characterHashing{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array : ");
    int n = sc.nextInt();

    char arr[] = new char[n];

    System.out.print("Enter elements of array : ");
    for(int i=0; i<n; i++)
      arr[i] = sc.next().charAt(0);

    int hash[] = new int[256];
    for(int i=0; i<n; i++)
      hash[arr[i]]++;

    System.out.print("Enter value for q : ");
    int q = sc.nextInt();

    while(q-- > 0){
      char ch;
      System.out.print("Enter a character : ");
      ch = sc.next().charAt(0);
      System.out.println("Count of "+ch+" : "+hash[ch]);
    }

    sc.close();
  }
}
