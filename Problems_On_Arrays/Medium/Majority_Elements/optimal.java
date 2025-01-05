// Moore's Voting Algorithm

class optimal {
  public static void main(String[] args) {
    int arr[] = { 2, 2, 3, 3, 1, 3, 2 };
    int n = arr.length;
    int ele = -1, count = 0;

    for (int num : arr) {
      if (count == 0)
        ele = num;

      if (num == ele)
        count++;
      else
        count--;
    }

    count = 0;
    for (int num : arr)
      if (ele == num)
        count++;

    if (count > (n / 2))
      System.out.println("Majority Element: " + ele);
    else
      System.out.println("Majority Element: " + -1);
  }
}