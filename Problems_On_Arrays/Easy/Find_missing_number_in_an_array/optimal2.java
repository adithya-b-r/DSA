package Find_missing_number_in_an_array;

class optimal2 {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 6 };
    int xor1 = 0, xor2 = 0;

    for (int i = 0; i < arr.length-1; i++) {
      xor2 = xor2 ^ arr[i];
      xor1 = xor1 ^ i+1;
    }

    xor1 = xor1 ^ arr.length;

    System.out.println("Missing number: " + (xor1 ^ xor2));
  }
}
