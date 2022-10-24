public class TypingMethod {
  // A class is simply a blueprint of an object
  public static void main(String[] args) {
    new TypingMethod().switchcase("Sunday", 7);
    new TypingMethod().condition("Sirri");
    
  }

  public void switchcase(String fname, int dayOfWeek)
    {
      dayOfWeek = 7;

      switch(dayOfWeek) {
        case 1:
        System.out.println("Monday");
        break;

        case 2:
        System.out.println("Tuesday");
        break;

        case 3:
        System.out.println("Wednesday");
        break;

        case 7:
        System.out.println("Sunday");
        break;
      }

        System.out.println(dayOfWeek);
    }
    
    public void condition(String Lname){
      Lname = "Sirri";

      if(Lname == "Ryisa") {
        System.out.println("Heyy cutie");
      }else if(Lname == "Sirri") {
        System.out.println("Put in the work and live you dream life");
      }else{
        System.out.println("Keep trying");
      }
    }
}