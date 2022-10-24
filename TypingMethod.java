public class TypingMethod {
  // A class is simply a blueprint of an object
  public static void main(String[] args) {
int num=1;
int nums=0; 
while(num<=1000) 
 { 
 nums=nums+num; 
 num++; 
 }  
System.out.println(nums);

// End of static method for while loop

int start = 12;
int end = 103;

for(int i = start; i <=end; i++){
if( i % 2 == 0 ){
System.out.println("even num "+i);
}
}

// End of static method to find sum of numbers btn 12-103


// Dynamic methods for days of week and condition

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
    }
    
    public void condition(String lname){
      lname = "Sirri";

      if(lname == "Ryisa") {
        System.out.println("Heyy cutie");
      }else if(lname == "Sirri") {
        System.out.println("Put in the work and live you dream life");
      }else{
        System.out.println("Keep trying");
      }
    }
}