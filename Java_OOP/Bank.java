public class Bank {
  // Encapsulation
  private String accountHolder;
  private long accountNumber;
  private double balance;
  private boolean isActive;
  private int secretPin;

  // Constructor
  public Bank(String accountHolder, long accountNumber, double balance, boolean isActive, int secretPin) {
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.isActive = isActive;
    this.secretPin = secretPin;
  }

  // Accessing Private values using getter and setter.
  public String getAccountHolder() {
    return accountHolder;
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public boolean getIsActive() {
    return isActive;
  }

  public int getSecretPin() {
    return secretPin;
  }

  public String deposit(double amount) {
    if (isActive) {
      if (amount > 0) {
        balance += amount;
        return "Deposit successful! Your new balance is Rs "+balance;
      } else {
        return "Amount must be greater than Rs 0";
      }
    } else {
      return "Unable to process the request";
    }
  }

  public boolean setIsActive(boolean status) {
    isActive = status;
    return status;
  }

  public String withdraw(double amount, int pin) {
    if (pin != secretPin) {
      return "Invalid PIN.";
    }

    if (isActive) {
      if (amount > 0) {
        if (amount <= balance - 500) {
          balance -= amount;
          return "Withdrew Rs " + amount + " successfully. Current balance: Rs " + balance;
        } else {
          return "Insufficient balance";
        }
      } else {
        return "Insufficient balance";
      }
    } else {
      return "Unable to process the request";
    }
  }
}