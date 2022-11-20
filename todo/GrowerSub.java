public class GrowerSub extends BaseSubscription{

  public GrowerSub(double amount, SubscriptionDuration durationInmonths, int totalNumberOfToDos, String name) {
    super(amount, durationInmonths, totalNumberOfToDos, name);
  }
  
  @Override
  boolean canAddToDo(){
    return true;
  }
}