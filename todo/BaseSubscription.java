public abstract class BaseSubscription{
  private double amount;
  private SubscriptionDuration durationInmonths;
  private int totalNumberOfToDos;
  private String name;

  public BaseSubscription(double amount, SubscriptionDuration durationInmonths, int totalNumberOfToDos, String name) {
    this.amount = amount;
    this.durationInmonths = durationInmonths;
    this.totalNumberOfToDos = totalNumberOfToDos;
    this.name = name;
  }

  public double getAmount() {
    return amount;
  }

  public String getName() {
    return name;
  }

  public int getTotalNumberOfToDos() {
    return totalNumberOfToDos;
  }

  public SubscriptionDuration getDurationInmonths() {
    return durationInmonths;
  }

  abstract boolean canAddToDo();
}

// Learn Constructor again