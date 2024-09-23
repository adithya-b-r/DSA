class patterns {
  public static void main(String[] args) {
    int n = 5;

    System.out.println("Pattern 1");
    p1(n);

    System.out.println("\nPattern 2");
    p2(n);

    System.out.println("\nPattern 3");
    p3(n);

    System.out.println("\nPattern 4");
    p4(n);

    System.out.println("\nPattern 5");
    p5(n);

    System.out.println("\nPattern 6");
    p6(n);

    System.out.println("\nPattern 7");
    p7(n);

    System.out.println("\nPattern 8");
    p8(n);

    System.out.println("\nPattern 9");
    p9(n);

    System.out.println("\nPattern 10");
    p10(n);

    System.out.println("\nPattern 11");
    p11(n);

    System.out.println("\nPattern 12");
    p12(n);

    System.out.println("\nPattern 13");
    p13(n);

    System.out.println("\nPattern 14");
    p14(n);

    // System.out.println("\nPattern 15");
    // p15(n);

    // System.out.println("\nPattern 16");
    // p16(n);

    // System.out.println("\nPattern 17");
    // p17(n);

    // System.out.println("\nPattern 18");
    // p18(n);

    System.out.println("\nPattern 19");
    p19(n);

    // System.out.println("\nPattern 20");
    // p20(n);
  }

  static void p1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  static void p4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  static void p5(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p6(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  static void p7(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) { // Space
        System.out.print("  ");
      }

      for (int j = 0; j < 2 * i + 1; j++) { // Star
        System.out.print("* ");
      }

      for (int j = 0; j < n - i - 1; j++) { // Space
        System.out.print("  ");
      }

      System.out.println();
    }
  }

  static void p8(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) { // Space
        System.out.print("  ");
      }

      for (int j = 0; j < 2 * n - (2 * i + 1); j++) { // Star
        System.out.print("* ");
      }

      for (int j = 0; j < i; j++) { // Space
        System.out.print("  ");
      }

      System.out.println();
    }
  }

  static void p9(int n) {
    p7(5);
    p8(5);
  }

  static void p10(int n) {
    for (int i = 1; i <= 2 * n - 1; i++) {
      int stars = i;

      if (stars >= n)
        stars = 2 * n - i;

      for (int j = 0; j < stars; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void p11(int n) {
    int start;

    for (int i = 0; i < n; i++) {
      start = i % 2 == 0 ? 1 : 0;
      for (int j = 0; j <= i; j++) {
        System.out.print(start + " ");
        start = 1 - start;
      }
      System.out.println();
    }
  }

  static void p12(int n) {
    int space = 2 * (n - 1);
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }

      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }

      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }

      System.out.println();
      space -= 2;
    }
  }

  static void p13(int n) {
    int num = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }

  static void p14(int n) {
    int alpha = 65;
    for (int i = 0; i < n; i++) {
      for (char j = 0; j <= i; j++) {
        System.out.print((char) alpha + " ");
        alpha++;
      }
      alpha = 65;
      System.out.println();
    }
  }

  static void p15(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {

      }
      System.out.println();
    }
  }

  static void p16(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {

      }
      System.out.println();
    }
  }

  static void p17(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {

      }
      System.out.println();
    }
  }

  static void p18(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {

      }
      System.out.println();
    }
  }

  static void p19(int n) {
    int spaces = 0;

    for (int i = 0; i < n; i++) {
      // Star
      for (int j = 0; j < n - i; j++)
        System.out.print("* ");

      // Space
      for (int j = 0; j < spaces; j++)
        System.out.print("  ");

      // Star
      for (int j = 0; j < n - i; j++)
        System.out.print("* ");

      spaces += 2;

      System.out.println();
    }

    spaces = n*2-2;

    for (int i = 0; i < n; i++) {
      // Star
      for (int j = 0; j <= i; j++)
        System.out.print("* ");

      // Space
      for (int j = 0; j < spaces; j++)
        System.out.print("  ");

      // Star
      for (int j = 0; j <= i; j++)
        System.out.print("* ");

      spaces -= 2;

      System.out.println();
    }
  }

  static void p20(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {

      }
    }
  }

}