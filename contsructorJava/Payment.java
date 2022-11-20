public class Payment{

  private String phoneNumber;
  private String  netWork;
  private double amount;
  private String currency;

  /**
   * 
   * @param phoneNumber
   * @param netWork
   * @param amount
   * @param currency
   */

  public Payment(String phoneNumber, String  netWork, double amount, String currency) {
    this.amount = amount;
    this.currency = currency;
    this.netWork = netWork;
    this.phoneNumber = phoneNumber;
  }

}


public class Users {
  private String firstName;
}