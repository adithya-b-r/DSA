public class Bank{
  //Encapsulation
  private String accountHolder;
  private long accountNumber;
  private double balance;
  private boolean isActive;
  private int secretPin;

  //Constructor
  public Bank(String accountHolder, long accountNumber, double balance, boolean isActive, int secretPin){
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.isActive = isActive;
    this.secretPin = secretPin;
  }

  public String getAccountHolder(){
    return accountHolder;
  }

}