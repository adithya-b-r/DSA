import java.util.Scanner;

class diamondChar {
  public static void main(String[] args) {
    char start = 'A';

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value for n: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int space = 0; space < n / 2 - i; space++) {
        System.out.print("#");
      }

      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }

      for (int space = 0; space < n / 2 - i; space++) {
        System.out.print("#");
      }

      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int space = 0; space > n / 2 + i; space++) {
        System.out.print("#");
      }

      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }

      for (int space = 0; space > n / 2 + i; space++) {
        System.out.print("#");
      }

      System.out.println();
    }
  }
}