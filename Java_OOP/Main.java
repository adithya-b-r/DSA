public class Main {
  public static void main(String[] args) {
    // Creating an instance of the Bank class
    Bank user = new Bank("Adithya", 1234567890L, 5000.0, true, 1234);

    System.out.println("Account Holder: " + user.getAccountHolder());
    System.out.println("Account Number: " + user.getAccountNumber());
    System.out.println("Balance: Rs " + user.getBalance());

    // Deposit
    System.out.println(user.deposit(1000.0));

    // Withdrawal
    System.out.println(user.withdraw(500.0, 1234));
  }
}
