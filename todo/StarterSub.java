public class StarterSub extends BaseSubscription{

  public StarterSub(double amount, SubscriptionDuration durationInmonths, int totalNumberOfToDos, String name) {
    super(amount, durationInmonths, totalNumberOfToDos, name);
  }
  
  @Override
  boolean canAddToDo(){
    boolean isAbleToAddTodo = this.getTotalNumberOfToDos() < 2;
    return isAbleToAddTodo;
  }
}