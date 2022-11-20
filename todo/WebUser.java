import java.rmi.server.UID;

public class WebUser extends BaseUser{
  public WebUser(UID id, String firstName, String lastName, String middleName, String email, String password) {
    super(id, firstName, lastName, middleName, email, password);
   
  }
 
  @Override
  public void logIn(String email, String password){

    if(this.getNoOfLoginAttemp()>=3){
      System.out.println("U");
      if()
    }


    // if(this.getNoOfLoginAttemp()<4){
      if(this.getEmail()==email && this.getPassword().equals(password)){
        //log them in
        System.out.println("You have logged in");
      }else{
        //display error message 
        System.out.println("Wrong email provided");
        this.setNoOfLoginAttemp(this.getNoOfLoginAttemp()+1);
      }
      //login logic
    // }
    // else{
      // blocing logic
      // this.setBlocked(true);
    // }
  // }

  @Override
  public void register(){

  }


}
